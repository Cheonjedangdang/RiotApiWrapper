package com.leelab.riotapi.apis.module;

import com.leelab.riotapi.apis.RestClient;
import com.leelab.riotapi.apis.champion.StaticChampion;
import com.leelab.riotapi.apis.utils.DTOMapper;
import com.leelab.riotapi.apis.utils.URLBuilder;

public class StaticChampionModule extends APIModule {

	public StaticChampionModule(String key, RestClient client) {
		super(key, client);
	}
	
	public StaticChampion getChampionDataById(long id) {
		URLBuilder url = new URLBuilder("https", "global.api.pvp.net");
		url.add("api").add("lol").add("static-data").add("kr").add("v1.2").add("champion").addWithOutSlash(id)
		.params()
		.addParam("api_key", getKey());
		
		return DTOMapper.mappingForObject(getClient().request(url.build()), StaticChampion.class, true, "id", "title", "name", "key");
	}
	
}
