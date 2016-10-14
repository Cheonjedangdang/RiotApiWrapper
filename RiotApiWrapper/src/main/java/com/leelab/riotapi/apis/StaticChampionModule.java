package com.leelab.riotapi.apis;

import org.json.simple.JSONObject;

import com.leelab.riotapi.RestClient;
import com.leelab.riotapi.champion.StaticChampion;
import com.leelab.riotapi.utils.DTOMapper;

public class StaticChampionModule extends APIModule {

	public StaticChampionModule(RiotAPISpec spec, RestClient client) {
		super(spec, client);
	}
	
	//https://global.api.pvp.net/api/lol/static-data/kr/v1.2/champion/54?api_key=2bb3c69c-85bd-4e5e-addf-4ee9768b8505
	
	public StaticChampion getChampionDataById(long id) {
		StaticChampion champ = new StaticChampion();
		
		String requestURI = new StringBuilder().append("https://global.api.pvp.net/api/lol/static-data/kr/v1.2/champion/").append(id)
				.append("?api_key=").append(getSpec().getApi_key()).toString();
		return DTOMapper.mappingForObject(getClient().request(requestURI), StaticChampion.class, true, "id", "title", "name", "key");
	}
	
}
