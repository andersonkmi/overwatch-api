package org.progfun.owapp.data;

import org.progfun.owapp.integration.OverwatchApi;
import org.progfun.owapp.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class AbilityRepository {

    @Autowired
    private OverwatchApi overwatchApi;

    public Collection<Ability> listAbilities() {
        return overwatchApi.listAbilities();
    }

    public Ability findById(Integer id) {
        return overwatchApi.findAbilityById(id);
    }
}
