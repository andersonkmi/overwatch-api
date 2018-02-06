package org.progfun.owapp.data;

import org.progfun.owapp.integration.OverwatchApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HeroRepository {
    @Autowired
    private OverwatchApi overwatchApi;

    public List<Hero> listHeros() {
        List<Hero> heroes = new ArrayList<>();
        Hero hero1 = new Hero();
        hero1.setId("1");
        hero1.setName("Hero 1");
        hero1.setRealName("Hero 1 real name");
        hero1.setShield("Hero 1 shield");
        hero1.setArmour("Hero 1 armour");

        heroes.add(hero1);

        Hero hero2 = new Hero();
        hero2.setId("2");
        hero2.setName("Hero 2");
        hero2.setRealName("Hero 2 real name");
        hero2.setShield("Hero 2 shield");
        hero2.setArmour("Hero 2 armour");

        heroes.add(hero2);

        return heroes;
    }

    public Hero findById(String id) {
        if(id.equals("1")) {
            Hero hero1 = new Hero();
            hero1.setId("1");
            hero1.setName("Hero 1");
            hero1.setRealName("Hero 1 real name");
            hero1.setShield("Hero 1 shield");
            hero1.setArmour("Hero 1 armour");

            return hero1;
        }

        return null;
    }

    public List<Ability> getHeroAbilities(String id) {
        if(id.equals("1")) {
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
        }

        return new ArrayList<>();
    }
}
