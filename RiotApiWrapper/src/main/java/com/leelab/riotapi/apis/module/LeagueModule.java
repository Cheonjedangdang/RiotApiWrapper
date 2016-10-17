package com.leelab.riotapi.apis.module;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.leelab.riotapi.apis.Locale;
import com.leelab.riotapi.apis.RestClient;
import com.leelab.riotapi.apis.league.League;
import com.leelab.riotapi.apis.league.LeagueEntry;
import com.leelab.riotapi.apis.league.LeagueEntryWithTier;
import com.leelab.riotapi.apis.league.MiniSeries;
import com.leelab.riotapi.apis.utils.DTOMapper;
import com.leelab.riotapi.apis.utils.URLBuilder;

public class LeagueModule extends APIModule{

	public LeagueModule(String key, RestClient client) {
		super(key, client);
		// TODO Auto-generated constructor stub
	}
	public ArrayList<League> getLeaguesBySummonerId(Locale locale, long id) {
		URLBuilder url = new URLBuilder("https", "kr.api.pvp.net").add("api").add("lol").add("kr").add("v2.5").add("league").add("by-summoner").addWithOutSlash(id)
	    		  												  .params()
	    		  												  .addParam("api_key", getKey()); 
		
		ArrayList<League> leagues = new ArrayList<League>();
		
		JSONObject obj = getClient().request(url.build());
		
		JSONArray leagueArrayJson = (JSONArray)obj.get(String.valueOf(id));
		
		for(Object o : leagueArrayJson)
		{
			JSONObject leagueElementJson = (JSONObject)o;
			League league = DTOMapper.mappingForObject(leagueElementJson, League.class, "entries");
			
			JSONArray entryArrayJson = (JSONArray)leagueElementJson.get("entries");

			ArrayList<LeagueEntry> entries = new ArrayList<LeagueEntry>();
			for(Object ob : entryArrayJson)
			{
				JSONObject entryElementJson = (JSONObject)ob;
				LeagueEntry entry = DTOMapper.mappingForObject(entryElementJson, LeagueEntry.class, "miniSeries");
				if(entryElementJson.get("miniSeries")!=null)
				{
					entry.setMiniSeries(DTOMapper.mappingForObject((JSONObject)entryElementJson.get("miniSeries"), MiniSeries.class));	
				}
				entries.add(entry);
			}
			
			league.setEntries(entries);
			leagues.add(league);
		}
		
		return leagues;
	}
	
	public LeagueEntryWithTier getLeagueEntryBySummonerId(Locale locale, long id) {
		ArrayList<League> leagues = getLeaguesBySummonerId(locale, id);
		
		for(League league : leagues)
		{
			for(LeagueEntry entry : league.getEntries())
			{
				if(entry.getPlayerOrTeamId().equals(id+""))
				{
					LeagueEntryWithTier lwt = new LeagueEntryWithTier();
					lwt.setEntry(entry);
					lwt.setTier(league.getTier());
					return lwt;
				}
			}
		}
		return null;
	}
	
}
