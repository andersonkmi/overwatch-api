package org.progfun.owapp.data;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AbilityRepository {

    public List<Ability> listAbilities() {
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

        Ability ab3 = new Ability();
        ab3.setId("3");
        ab3.setName("Strength");
        ab3.setDescription("Motherfucker strength power");
        ab3.setIsUltimate(true);


        List<Ability> items = new ArrayList<>();
        items.add(ab1);
        items.add(ab2);
        items.add(ab3);
        return items;
    }

    public Ability findById(String id) {
        if(id.equals("3")) {
            Ability ab3 = new Ability();
            ab3.setId("3");
            ab3.setName("Strength");
            ab3.setDescription("Motherfucker strength power");
            ab3.setIsUltimate(true);

            return ab3;
        }

        return null;
    }
}
