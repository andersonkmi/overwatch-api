package org.progfun.owapp.controller;

import org.progfun.owapp.data.Ability;
import org.progfun.owapp.data.AbilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/abilities")
public class AbilityRestController {

    @Autowired
    private AbilityRepository abilityRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Ability> listAbilities() {
        return abilityRepository.listAbilities();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{abilityId}")
    public Ability findById(@PathVariable String abilityId) {
        return abilityRepository.findById(abilityId);
    }
}
