package org.progfun.owapp.controller;

import org.progfun.owapp.data.Ability;
import org.progfun.owapp.data.AbilityRepository;
import org.progfun.owapp.data.ErrorReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/abilities")
public class AbilityRestController {

    @Autowired
    private AbilityRepository abilityRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Ability> listAbilities() {
        return abilityRepository.listAbilities();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{abilityId}")
    public @ResponseBody Object findById(@PathVariable String abilityId) {
        Ability result = abilityRepository.findById(Integer.valueOf(abilityId));
        if(result != null) {
            return result;
        }
        return new ErrorReturn().setErrorCode(404).setMessage("Id not found");
    }
}
