package com.leelab.riotapi.apis;

import org.json.simple.JSONObject;

import com.leelab.riotapi.RestClient;

public class ChampionModule extends APIModule{
	
	private RiotAPISpec spec;
	
	public ChampionModule(RiotAPISpec spec, RestClient client) {
		super(spec, client);
	}
	
	public String getChampion(Locale locale, boolean freeToPlay){
		spec.setVersion("v1.2");
		String requestURL = spec.generate(locale)+"/champion?freeToPlay="+freeToPlay+"&api_key="+spec.getApi_key();
		JSONObject obj = getClient().request(requestURL);
		System.out.println(obj.toJSONString());
		//System.out.println(spec.generate(locale)+"/champion?freeToPlay="+freeToPlay+"&api_key="+spec.getApi_key());
		return "";
	}
	
	public String getChampionNumber(Locale locale, long id){
		spec.setVersion("v1.2");
		String requestURL = spec.generate(locale)+"/champion/="+id+"?api_key="+spec.getApi_key();
		JSONObject obj = getClient().request(requestURL);
		System.out.println(obj.toJSONString());
		return "";
	}
	
}
