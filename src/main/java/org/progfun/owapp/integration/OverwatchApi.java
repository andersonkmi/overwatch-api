package org.progfun.owapp.integration;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.progfun.owapp.data.Ability;
import org.progfun.owapp.data.Hero;
import org.progfun.owapp.util.HttpUtil;
import org.progfun.owapp.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Vector;
import java.util.stream.Collectors;

@Service
public class OverwatchApi {

    private static final String OVERWATCH_FIND_HERO_BY_ID = "https://overwatch-api.net/api/v1/hero/%d";
    private static final String OVERWATCH_FIND_ABILITY_BY_ID = "https://overwatch-api.net/api/v1/ability/%d";

    @Autowired
    private HttpUtil httpUtil;

    @Autowired
    private JsonUtil jsonUtil;

    public Collection<Hero> listHeros() {
        try {
            String json = httpUtil.sendGet("https://overwatch-api.net/api/v1/hero/");
            return jsonUtil.buildHeroList(json);
        } catch (Exception exception) {
            return new Vector<>();
        }
    }

    public Hero findById(Integer id) {
        String url = String.format(OVERWATCH_FIND_HERO_BY_ID, id);
        try {
            String json = httpUtil.sendGet(url);
            return jsonUtil.buildHero(json);
        } catch (IOException | JSONException e) {
            return null;
        }
    }

    public Collection<Ability> getHeroAbilities(Integer id) {
        try {
            String json = httpUtil.sendGet("https://overwatch-api.net/api/v1/ability/");
            Map<Integer, Integer> items = jsonUtil.buildHeroAbilityList(json);
            Collection<Ability> abilities = new Vector<>();
            items.entrySet().stream().filter(p -> p.getValue().equals(id)).map(k -> k.getKey()).collect(Collectors.toSet()).stream().forEach(p -> {
                Ability element = findAbilityById(p);
                abilities.add(element);
            });
            return abilities;
        } catch (IOException | JSONException e) {
            return null;
        }
    }

    public Collection<Ability> listAbilities() {
        try {
            String json = httpUtil.sendGet("https://overwatch-api.net/api/v1/ability/");
            return jsonUtil.buildAbilityList(json);
        } catch (Exception exception) {
            return new Vector<>();
        }
    }

    public Ability findAbilityById(Integer id) {
        String url = String.format(OVERWATCH_FIND_ABILITY_BY_ID, id);
        try {
            String json = httpUtil.sendGet(url);
            return jsonUtil.buildAbility(json);
        } catch (IOException | JSONException e) {
            return null;
        }

    }
}
