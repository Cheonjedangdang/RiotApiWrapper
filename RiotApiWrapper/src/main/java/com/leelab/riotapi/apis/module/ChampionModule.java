package com.leelab.riotapi.apis.module;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.leelab.riotapi.apis.Locale;
import com.leelab.riotapi.apis.RestClient;
import com.leelab.riotapi.apis.champion.Champion;
import com.leelab.riotapi.apis.utils.DTOMapper;
import com.leelab.riotapi.apis.utils.URLBuilder;

public class ChampionModule extends APIModule{
   
   public ChampionModule(String key, RestClient client) {
		super(key, client);
	}
   
   public ArrayList<Champion> getChampion(Locale locale, boolean freeToPlay){
      URLBuilder url = new URLBuilder("https", "kr.api.pvp.net").add("api").add("lol").add("kr").add("v1.2").addWithOutSlash("champion")
    		  													.params()
    		  													.addParam("freeToPlay", freeToPlay).and()
    		  													.addParam("api_key", getKey()); 
      
      JSONObject obj = getClient().request(url.build());

      return DTOMapper.mappingForList((JSONArray)obj.get("champions"), Champion.class);
   }

   public Champion getChampionById(Locale locale, long id){
      URLBuilder url = new URLBuilder("https", "kr.api.pvp.net").add("api").add("lol").add("kr").add("v1.2").add("champion").add(id)
																.params()
																.addParam("api_key", getKey()); 
      JSONObject obj = getClient().request(url.build());
      return DTOMapper.mappingForObject(obj, Champion.class);
   }
   
}
