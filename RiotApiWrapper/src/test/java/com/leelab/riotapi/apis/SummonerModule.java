package com.leelab.riotapi.apis;

public class SummonerModule implements APIModule {
	private RiotAPISpec spec;
	
	public void getSummonerByName(Locale locale, String summonerName) {
		System.out.println("=====================================================================================");
		System.out.println(spec.generate(locale)+"/summoner/by-name/"+summonerName+"?api_key="+spec.getApi_key());
		System.out.println("=====================================================================================");
	}

	@Override
	public void setAPISpec(RiotAPISpec spec) {
		this.spec = spec;
	}
}
