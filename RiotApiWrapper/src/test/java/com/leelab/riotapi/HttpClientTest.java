package com.leelab.riotapi;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.leelab.riotapi.apis.ChampionModule;
import com.leelab.riotapi.apis.GameModule;
import com.leelab.riotapi.apis.Locale;
import com.leelab.riotapi.apis.RiotApi;
import com.leelab.riotapi.apis.SummonerModule;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/test.xml"})
public class HttpClientTest {
	
	@Autowired
	ApplicationContext context;
	
	SummonerModule summonerModule;
	ChampionModule championModule;
	GameModule gameModule;
	
	@Before
	public void setUp() {
		RiotApi api = context.getBean("api", RiotApi.class);
		summonerModule = api.callModule(SummonerModule.class);
		championModule = api.callModule(ChampionModule.class);
		gameModule = api.callModule(GameModule.class);
	}
	
	@Test
	public void test() {
		summonerModule.getSummonerByName(Locale.KR, "±â¼÷»çÂõ¾î");
		gameModule.getRecentGamesBySummonerId(Locale.KR, 10009456);
	}
	
}
