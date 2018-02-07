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
import java.util.Vector;

@Service
public class OverwatchApi {
    private static final Logger logger = Logger.getLogger(OverwatchApi.class);

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
        } catch (IOException e) {
            return null;
        } catch (JSONException exception) {
            return null;
        }
    }

    public Collection<Ability> getHeroAbilities(Integer id) {
        String url = String.format(OVERWATCH_FIND_HERO_BY_ID, id);
        try {
            String json = httpUtil.sendGet(url);
            return jsonUtil.buildHeroAbilityList(json);
        } catch (IOException e) {
            return null;
        } catch (JSONException exception) {
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
        } catch (IOException e) {
            return null;
        } catch (JSONException exception) {
            return null;
        }

    }
}
