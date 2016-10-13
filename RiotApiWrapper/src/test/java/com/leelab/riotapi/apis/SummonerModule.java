package com.leelab.riotapi.apis;

import org.json.simple.JSONObject;

import com.leelab.riotapi.RestClient;

public class SummonerModule extends APIModule {
	
	public SummonerModule(RiotAPISpec spec, RestClient client) {
		super(spec, client);
	}
	
	public String getSummonerByName(Locale locale, String summonerName) {
		JSONObject obj = getClient().request(getSpec().generate(locale)+"/summoner/by-name/"+summonerName+"?api_key="+getSpec().getApi_key());
		System.out.println(obj.toJSONString());
		return "";
	}
	
	public String getSummonerById(Locale locale, String summonerId) {
		return getSpec().generate(locale)+"/summoner/"+summonerId+"?api_key="+getSpec().getApi_key();
	}
}
