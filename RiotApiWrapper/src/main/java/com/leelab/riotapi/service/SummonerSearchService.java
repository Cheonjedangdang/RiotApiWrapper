package com.leelab.riotapi.service;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.leelab.riotapi.apis.ChampionModule;
import com.leelab.riotapi.apis.GameModule;
import com.leelab.riotapi.apis.Locale;
import com.leelab.riotapi.apis.RiotApi;
import com.leelab.riotapi.apis.StaticChampionModule;
import com.leelab.riotapi.apis.SummonerModule;
import com.leelab.riotapi.game.Game;
import com.leelab.riotapi.summoner.Summoner;

public class SummonerSearchService extends Service{

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