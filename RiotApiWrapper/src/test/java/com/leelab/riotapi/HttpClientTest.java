package com.leelab.riotapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.leelab.riotapi.apis.Locale;
import com.leelab.riotapi.apis.RiotApi;
import com.leelab.riotapi.apis.SummonerModule;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/test.xml"})
public class HttpClientTest {
	
	@Autowired
	ApplicationContext context;
	
	@Test
	public void test() {
		RiotApi api = context.getBean("api", RiotApi.class);
		
		api.callModule(SummonerModule.class).getSummonerByName(Locale.KR, "±â¼÷»çÂõ¾î");
	}
	
}
