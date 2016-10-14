package com.leelab.riotapi.apis;

import org.json.simple.JSONObject;

import com.leelab.riotapi.RestClient;
import com.leelab.riotapi.summoner.Summoner;
import com.leelab.riotapi.utils.DTOMapper;

public class SummonerModule extends APIModule {
	
	public SummonerModule(RiotAPISpec spec, RestClient client) {
		super(spec, client);		
	}
	
	public Summoner getSummonerByName(Locale locale, String summonerName) {
		String requestURI = getSpec().generate(locale,"v1.4")+"/summoner/by-name/"+summonerName+"?api_key="+getSpec().getApi_key();
		JSONObject obj = getClient().request(requestURI);
		
		JSONObject jj = (JSONObject) obj.get(summonerName);
		
		return DTOMapper.mappingForObject((JSONObject)obj.get(summonerName), Summoner.class);
	}
	
	public Summoner getSummonerById(Locale locale, long summonerId) {
		String requestURI = getSpec().generate(locale,"v1.4")+"/summoner/"+summonerId+"?api_key="+getSpec().getApi_key();
		JSONObject obj = getClient().request(requestURI);
		return DTOMapper.mappingForObject((JSONObject)obj.get(10009456+""), Summoner.class);
	}
}
