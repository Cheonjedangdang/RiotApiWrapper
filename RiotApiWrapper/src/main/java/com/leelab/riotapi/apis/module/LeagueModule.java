package com.leelab.riotapi.apis.module;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.leelab.riotapi.apis.Locale;
import com.leelab.riotapi.apis.RestClient;
import com.leelab.riotapi.apis.league.League;
import com.leelab.riotapi.apis.utils.DTOMapper;
import com.leelab.riotapi.apis.utils.URLBuilder;

public class LeagueModule extends APIModule{

	public LeagueModule(String key, RestClient client) {
		super(key, client);
		// TODO Auto-generated constructor stub
	}
	public ArrayList<League> getChampion(Locale locale, String summonerIds){
	      URLBuilder url = new URLBuilder("https", "kr.api.pvp.net").add("api").add("lol").add("kr").add("v2.5").addWithOutSlash("league")
	    		  													.params()
	    		  													.add("by-summoner").addWithOutSlash(summonerIds)
	    		  													.addParam("api_key", getKey()); 
	      
	      JSONObject obj = getClient().request(url.build());

	      return DTOMapper.mappingForList((JSONArray)obj.get(summonerIds), League.class);
	}

}
