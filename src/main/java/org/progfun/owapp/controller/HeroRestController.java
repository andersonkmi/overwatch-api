package org.progfun.owapp.controller;

import org.progfun.owapp.data.Ability;
import org.progfun.owapp.data.Hero;
import org.progfun.owapp.data.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/heros")
public class HeroRestController {

    @Autowired
    private HeroRepository heroRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Hero> listHeros() {
        return heroRepository.listHeros();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{heroId}")
    public Hero getHeroById(@PathVariable String heroId) {
        return heroRepository.findById(heroId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{heroId}/abilities")
    public List<Ability> getHeroAbilities(@PathVariable String heroId) {
        return heroRepository.getHeroAbilities(heroId);
    }
}
