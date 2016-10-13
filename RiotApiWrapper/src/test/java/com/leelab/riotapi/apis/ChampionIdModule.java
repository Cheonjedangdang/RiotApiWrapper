package com.leelab.riotapi.apis;

public class ChampionIdModule implements APIModule{
	
	private RiotAPISpec spec;
	
	public String getChampion(Locale locale, long id){
		spec.setVersion("v1.2");
		return spec.generate(locale)+"/champion/="+id+"?api_key="+spec.getApi_key();
	}
	@Override
	public void setAPISpec(RiotAPISpec spec) {
		// TODO Auto-generated method stub
		this.spec = spec;
	}

}
