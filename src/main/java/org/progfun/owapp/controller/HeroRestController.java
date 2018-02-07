package org.progfun.owapp.controller;

import org.progfun.owapp.data.Ability;
import org.progfun.owapp.data.ErrorReturn;
import org.progfun.owapp.data.Hero;
import org.progfun.owapp.data.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/heros")
public class HeroRestController {

    @Autowired
    private HeroRepository heroRepository;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody Collection<Hero> listHeros() {
        return heroRepository.listHeros();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{heroId}")
    public @ResponseBody Object getHeroById(@PathVariable String heroId) {
        Hero result = heroRepository.findById(Integer.valueOf(heroId));
        if(result != null) {
            return result;
        }

        return new ErrorReturn().setErrorCode(404).setMessage("Id not found");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{heroId}/abilities")
    public List<Ability> getHeroAbilities(@PathVariable String heroId) {
        return heroRepository.getHeroAbilities(heroId);
    }
}
