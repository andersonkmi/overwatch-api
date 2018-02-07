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

    public List<Ability> getHeroAbilities(String id) {
        /*if(id.equals("1")) {
            Ability ab1 = new Ability();
            ab1.setId("1");
            ab1.setName("Laser vision");
            ab1.setDescription("Laser vision power");
            ab1.setIsUltimate(false);

            Ability ab2 = new Ability();
            ab2.setId("2");
            ab2.setName("Flying");
            ab2.setDescription("Flying power");
            ab2.setIsUltimate(true);

            List<Ability> items = new ArrayList<>();
            items.add(ab1);
            items.add(ab2);
            return items;
        }*/

        return new ArrayList<>();
    }
}
