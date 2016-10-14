package com.leelab.riotapi.apis;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.leelab.riotapi.RestClient;


public class ChampionModule extends APIModule{
	
	public ChampionModule(RiotAPISpec spec, RestClient client) {
		super(spec, client);
	}
	
	public JSONArray getChampion(Locale locale, boolean freeToPlay){
		getSpec().setVersion("v1.2");
		String requestURL = getSpec().generate(locale)+"/champion?freeToPlay="+freeToPlay+"&api_key="+getSpec().getApi_key();
		JSONObject obj = getClient().request(requestURL);
		System.out.println(obj.toJSONString());
		
		JSONArray champions = (JSONArray)obj.get("champions");
		for(Object ch : champions) {
		      JSONObject champ = (JSONObject)ch;
		}
		//System.out.println(spec.generate(locale)+"/champion?freeToPlay="+freeToPlay+"&api_key="+spec.getApi_key());
		return champions;
	}

	public String getChampionNumber(Locale locale, long id){
		getSpec().setVersion("v1.2");
		String requestURL = getSpec().generate(locale)+"/champion/"+id+"?api_key="+getSpec().getApi_key();
		System.out.println(requestURL);
		JSONObject obj = getClient().request(requestURL);
		System.out.println(obj.toJSONString());
		return "";
	}
	
}
