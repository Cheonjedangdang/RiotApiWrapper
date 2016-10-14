package com.leelab.riotapi.controller;

import java.util.HashMap;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.leelab.riotapi.apis.RiotApi;
import com.leelab.riotapi.apis.StaticChampionModule;
import com.leelab.riotapi.champion.StaticChampion;

@Controller
@RequestMapping("ajax")
public class AjaxController implements ApplicationContextAware {
	
	ApplicationContext ctx;
	
	@RequestMapping("championKey")
	@ResponseBody
	public HashMap<String, String> a(@RequestParam HashMap<String, Object> param) {
		
		RiotApi api = ctx.getBean("api", RiotApi.class);
		HashMap<String, String> map = new HashMap<String, String>();
		StaticChampion sChamp = api.callModule(StaticChampionModule.class).getChampionDataById(Long.parseLong(param.get("id").toString()));
		map.put("key", sChamp.getKey());
		System.out.println(sChamp);
		return map;
	}

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx = ctx;		
	}
	
}
