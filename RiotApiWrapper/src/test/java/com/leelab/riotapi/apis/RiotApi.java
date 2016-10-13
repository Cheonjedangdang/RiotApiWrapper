package com.leelab.riotapi.apis;

import com.leelab.riotapi.RestClient;

public class RiotApi {
	private RestClient getter;
	private RiotAPISpec apiSpec;

	/*
	 * https://kr.api.pvp.net/api/lol/kr/v1.4/summoner/by-name/±â¼÷»çÂõ¾î?api_key=2bb3c69c-85bd-4e5e-addf-4ee9768b8505
	 * */
	public void getSummonerByName(Locale locale, String summonerName) {
		
		System.out.println(apiSpec.generate(locale)+"/summoner");
		
	}
	
	public RestClient getGetter() {
		return getter;
	}
	public void setGetter(RestClient getter) {
		this.getter = getter;
	}
	public RiotAPISpec getApiSpec() {
		return apiSpec;
	}
	public void setApiSpec(RiotAPISpec apiSpec) {
		this.apiSpec = apiSpec;
	}
}
