package com.leelab.riotapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="summoner")
public class SummonerController {

	@RequestMapping(value="search")
	public String search(String userName) {
		System.out.println(userName);
		
		
		return "summoner/summoner";
	}
	
}
