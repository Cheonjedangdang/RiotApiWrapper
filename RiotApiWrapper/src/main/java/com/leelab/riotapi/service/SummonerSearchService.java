package com.leelab.riotapi.service;

import org.springframework.ui.Model;

import com.leelab.riotapi.apis.GameModule;
import com.leelab.riotapi.apis.Locale;
import com.leelab.riotapi.apis.RiotApi;
import com.leelab.riotapi.apis.SummonerModule;
import com.leelab.riotapi.summoner.Summoner;

public class SummonerSearchService extends Service{

	@Override
	public void handleRequest(RiotApi api, Object... params) {
		String summonerName = (String)params[0];
		Model model = (Model)params[1];
		
		Summoner summoner = api.callModule(SummonerModule.class).getSummonerByName(Locale.KR, summonerName);
		
		model.addAttribute("summoner", summoner);
		api.callModule(GameModule.class).getRecentGamesBySummonerId(Locale.KR, summoner.getId());

	}
	
}
