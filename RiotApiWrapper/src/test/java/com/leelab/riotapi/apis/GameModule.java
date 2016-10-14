package com.leelab.riotapi.apis;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.leelab.riotapi.RestClient;
import com.leelab.riotapi.game.FellowPlayer;
import com.leelab.riotapi.game.Game;
import com.leelab.riotapi.game.RawStats;
import com.leelab.riotapi.utils.DTOMapper;

public class GameModule extends APIModule {
	
	public GameModule(RiotAPISpec spec, RestClient client) {
		super(spec, client);
	}
	
	//https://kr.api.pvp.net/api/lol/kr/v1.3/game/by-summoner/10009456/recent?api_key=2bb3c69c-85bd-4e5e-addf-4ee9768b8505
	
	public ArrayList<Game> getRecentGamesBySummonerId(Locale locale, int id) {
		StringBuilder sb = new StringBuilder();
		sb.append(getSpec().generate(locale,"v1.3")).append("/game/by-summoner/").append(id).append("/recent?api_key=").append(getSpec().getApi_key());
		String requestURI = sb.toString();
		
		JSONObject obj = getClient().request(requestURI);
		JSONArray arr = (JSONArray)obj.get("games");
		System.out.println(obj);
		ArrayList<Game> games = new ArrayList<Game>();
		
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
