package com.leelab.riotapi.apis;

public class ChampionModule implements APIModule{
	
	private RiotAPISpec spec;
	
	public String getChampion(Locale locale, boolean freeToPlay){
		spec.setVersion("v1.2");
		System.out.println(spec.generate(locale)+"/champion?freeToPlay="+freeToPlay+"&api_key="+spec.getApi_key());
		return spec.generate(locale)+"/champion?freeToPlay="+freeToPlay+"&api_key="+spec.getApi_key();
	}
	@Override
	public void setAPISpec(RiotAPISpec spec) {
		// TODO Auto-generated method stub
		this.spec = spec;
	}
	
}
