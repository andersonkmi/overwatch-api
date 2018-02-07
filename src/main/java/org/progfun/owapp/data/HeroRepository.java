package org.progfun.owapp.data;

import org.progfun.owapp.integration.OverwatchApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class HeroRepository {
    @Autowired
    private OverwatchApi overwatchApi;

    public Collection<Hero> listHeros() {
        return overwatchApi.listHeros();
    }

    public Hero findById(Integer id) {
        return overwatchApi.findById(id);
    }

    public Collection<Ability> getHeroAbilities(Integer id) {
        return overwatchApi.getHeroAbilities(id);
    }
}
