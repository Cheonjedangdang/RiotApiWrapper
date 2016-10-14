package com.leelab.riotapi.apis.module;

import org.json.simple.JSONObject;

import com.leelab.riotapi.apis.Locale;
import com.leelab.riotapi.apis.RestClient;
import com.leelab.riotapi.apis.summoner.Summoner;
import com.leelab.riotapi.apis.utils.DTOMapper;
import com.leelab.riotapi.apis.utils.URLBuilder;

public class SummonerModule extends APIModule {
	
	public SummonerModule(String key, RestClient client) {
		super(key, client);		
	}
	
	public Summoner getSummonerByName(Locale locale, String summonerName) {
		URLBuilder url = new URLBuilder("https", "kr.api.pvp.net").add("api").add("lol").add("kr").add("v1.4").add("summoner").add("by-name").addWithOutSlash(summonerName)
																  			 .params()
																  			 .addParam("api_key", getKey());
		JSONObject obj = getClient().request(url.build());
		return DTOMapper.mappingForObject((JSONObject)obj.get(summonerName), Summoner.class);
	}
	
	public Summoner getSummonerById(Locale locale, long summonerId) {
		URLBuilder url = new URLBuilder("https", "kr.api.pvp.net").add("api").add("lol").add("kr").add("v1.4").add("summoner").addWithOutSlash(summonerId)
																  			 .params()
																  			 .addParam("api_key", getKey());
		JSONObject obj = getClient().request(url.build());
		return DTOMapper.mappingForObject((JSONObject)obj.get(summonerId), Summoner.class);
	}
}
