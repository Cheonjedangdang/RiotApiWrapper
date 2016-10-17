package com.leelab.riotapi.apis.module;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.leelab.riotapi.apis.Locale;
import com.leelab.riotapi.apis.RestClient;
import com.leelab.riotapi.apis.game.FellowPlayer;
import com.leelab.riotapi.apis.game.Game;
import com.leelab.riotapi.apis.game.RawStats;
import com.leelab.riotapi.apis.utils.DTOMapper;
import com.leelab.riotapi.apis.utils.URLBuilder;

public class GameModule extends APIModule {
	
	public GameModule(String key, RestClient client) {
		super(key, client);
	}
	
	public ArrayList<Game> getRecentGamesBySummonerId(Locale locale, long id) {
		URLBuilder url = new URLBuilder("https", "kr.api.pvp.net").add("api").add("lol").add("kr").add("v1.3").add("game").add("by-summoner").add(id).addWithOutSlash("recent")
																  .params()
																  .addParam("api_key", getKey());
		JSONObject obj = getClient().request(url.build());
		JSONArray arr = (JSONArray)obj.get("games");

		ArrayList<Game> games = new ArrayList<Game>();
		//https://kr.api.pvp.net/api/lol/kr/v1.3/game/by-summoner/10009456/recent?api_key=2bb3c69c-85bd-4e5e-addf-4ee9768b8505
		for(Object o : arr)
		{
			JSONObject gameObj = (JSONObject)o;
			Game game = DTOMapper.mappingForObject(gameObj, Game.class, "stats","fellowPlayers");
			JSONArray jarr = (JSONArray) gameObj.get("fellowPlayers");
			game.setFellowPlayers(DTOMapper.mappingForList(jarr, FellowPlayer.class));
			game.setStats(DTOMapper.mappingForObject((JSONObject)gameObj.get("stats"), RawStats.class));
			games.add(game);
		}
		
		return games;
	}
	
}
