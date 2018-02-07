package org.progfun.owapp.util;

import org.json.JSONArray;
import org.json.JSONObject;
import org.progfun.owapp.data.Ability;
import org.progfun.owapp.data.Hero;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Vector;

@Service
public class JsonUtil {

    public Collection<Hero> buildHeroList(String json) {
        Collection<Hero> heroes = new Vector<>();
        JSONObject obj = new JSONObject(json);

        JSONArray arr = obj.getJSONArray("data");
        arr.forEach(item -> {
            heroes.add(buildHero((JSONObject) item));
        });

        return heroes;
    }

    public Hero buildHero(String json) {
        return buildHero(new JSONObject(json));
    }

    public Ability buildAbility(String json) {
        return buildAbility(new JSONObject(json));
    }

    public Collection<Ability> buildHeroAbilityList(String json) {
        Collection<Ability> heroes = new Vector<>();
        JSONObject obj = new JSONObject(json);

        JSONArray arr = obj.getJSONArray("data");
        arr.forEach(item -> {
            heroes.add(buildAbility((JSONObject) item));
        });

        return heroes;

    }

    public Collection<Ability> buildAbilityList(String json) {
        Collection<Ability> elements = new Vector<>();
        JSONObject obj = new JSONObject(json);

        JSONArray arr = obj.getJSONArray("data");
        arr.forEach(item -> {
            elements.add(buildAbility((JSONObject) item));
        });

        return elements;

    }

    private Hero buildHero(JSONObject jsonObject) {
        return new Hero().setId(jsonObject.getInt("id"))
                .setName(jsonObject.getString("name"))
                .setRealName(jsonObject.getString("real_name"))
                .setArmour(jsonObject.getInt("armour"))
                .setHealth(jsonObject.getInt("health"))
                .setShield(jsonObject.getInt("shield"));
    }


    private Ability buildAbility(JSONObject jsonObject) {
        return new Ability().setId(jsonObject.getInt("id"))
                .setName(jsonObject.getString("name"))
                .setDescription(jsonObject.getString("description"))
                .setIsUltimate(jsonObject.getBoolean("is_ultimate"));
    }

}
