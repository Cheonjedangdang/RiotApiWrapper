package com.leelab.riotapi.apis;

import com.leelab.riotapi.RestClient;

public class GameModule extends APIModule {
	
	public GameModule(RiotAPISpec spec, RestClient client) {
		super(spec, client);
	}
	
	//https://kr.api.pvp.net/api/lol/kr/v1.3/game/by-summoner/10009456/recent?api_key=2bb3c69c-85bd-4e5e-addf-4ee9768b8505
	
	public void getRecentGamesBySummonerId(Locale locale, int id) {
		getSpec().setVersion("v1.3");
		StringBuilder sb = new StringBuilder();
		sb.append(getSpec().generate(locale)).append("/game/by-summoner/").append(id).append("/recent?api_key=").append(getSpec().getApi_key());
		String requestURI = sb.toString();
		System.out.println(getClient().request(requestURI));		
	}
	
}
