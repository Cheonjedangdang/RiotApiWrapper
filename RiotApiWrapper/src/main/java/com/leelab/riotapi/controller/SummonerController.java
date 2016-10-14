package com.leelab.riotapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.leelab.riotapi.apis.RiotApi;
import com.leelab.riotapi.service.SummonerSearchService;

@Controller
@RequestMapping(value="summoner")
public class SummonerController {
	
	private static Logger logger = LoggerFactory.getLogger(SummonerController.class);
	
	@Autowired
	RiotApi api;
	
	@RequestMapping(value="search")
	public String search(String summonerName, Model model) {
		logger.info("Search summoner by name : "+summonerName);
		new SummonerSearchService().execute(api, summonerName, model);
		return "summoner/summoner";
	}
	
}
