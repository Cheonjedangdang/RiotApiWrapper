package com.leelab.riotapi.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;

import com.leelab.riotapi.apis.Locale;
import com.leelab.riotapi.apis.RiotApi;
import com.leelab.riotapi.apis.game.Game;
import com.leelab.riotapi.apis.module.GameModule;
import com.leelab.riotapi.apis.module.SummonerModule;
import com.leelab.riotapi.apis.summoner.Summoner;

public class SummonerSearchService extends Service{
	
	private static Logger logger = LoggerFactory.getLogger(SummonerSearchService.class);
	
    @Override
    public void handleRequest(RiotApi api, Object... params) {
    	String summonerName = ((String)params[0]).replace(" ", "");
    	Model model = (Model)params[1];
    	
    	Summoner summoner = api.callModule(SummonerModule.class).getSummonerByName(Locale.KR, summonerName);
    	ArrayList<Game> games = api.callModule(GameModule.class).getRecentGamesBySummonerId(Locale.KR, summoner.getId());
      
    	model.addAttribute("summoner", summoner);
    	model.addAttribute("games", games);
    }
   
}