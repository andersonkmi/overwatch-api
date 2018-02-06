package org.progfun.owapp.integration;

import org.json.JSONArray;
import org.json.JSONObject;
import org.progfun.owapp.data.Hero;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collection;
import java.util.Vector;

@Service
public class OverwatchApi {
    private final String USER_AGENT = "Mozilla/5.0";

    public Collection<Hero> listHeros() {
        try {
            String json = sendGet("https://overwatch-api.net/api/v1/hero/");
            return buildHeroList(json);
        } catch (Exception exception) {
            return new Vector<>();
        }

    }

    private String sendGet(String url) throws IOException {
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();

        if(responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            return response.toString();
        }

        return "";
    }

    private Collection<Hero> buildHeroList(String json) {
        Collection<Hero> heroes = new Vector<>();
        JSONObject obj = new JSONObject(json);
        //int total = obj.getInt("total");

        JSONArray arr = obj.getJSONArray("data");
        arr.forEach(item -> {
            Hero element = new Hero();
            element.setId(((JSONObject) item).getInt("id"));
            element.setName(((JSONObject) item).getString("name"));
            element.setRealName(((JSONObject) item).getString("real_name"));
            element.setArmour(((JSONObject) item).getInt("armour"));
            element.setHealth(((JSONObject) item).getInt("health"));
            element.setShield(((JSONObject) item).getInt("shield"));
            heroes.add(element);
        });

        return heroes;
    }
}
