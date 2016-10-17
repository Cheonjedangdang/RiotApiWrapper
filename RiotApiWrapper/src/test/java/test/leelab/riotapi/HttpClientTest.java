package test.leelab.riotapi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.leelab.riotapi.apis.Locale;
import com.leelab.riotapi.apis.RiotApi;
import com.leelab.riotapi.apis.game.Game;
import com.leelab.riotapi.apis.module.ChampionModule;
import com.leelab.riotapi.apis.module.GameModule;
import com.leelab.riotapi.apis.module.LeagueModule;
import com.leelab.riotapi.apis.module.SummonerModule;
import com.leelab.riotapi.apis.summoner.Summoner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/test.xml"})
public class HttpClientTest {
	
	@Autowired
	ApplicationContext context;
	
	SummonerModule summonerModule;
	ChampionModule championModule;
	GameModule gameModule;
	LeagueModule l;
	
	@Before
	public void setUp() {
		RiotApi api = context.getBean("api", RiotApi.class);
		summonerModule = api.callModule(SummonerModule.class);
		championModule = api.callModule(ChampionModule.class);
		gameModule = api.callModule(GameModule.class);
		l = api.callModule(LeagueModule.class);
	}
	
	@Test
	public void test() throws URISyntaxException, IOException {
		
//		File f = new File(this.getClass().getResource("/test/resources/input").toURI().getPath());
//		BufferedReader br = new BufferedReader(new FileReader(f));
//		
//		while(true)
//		{
//			String s = br.readLine();
//			if(s==null)break;
//			String[] a = s.split("\t");
//			System.out.println("private "+a[1]+" "+a[0]+";");
//		}
		//l.getLeaguesBySummonerId(Locale.KR, summonerModule.getSummonerByName(Locale.KR, "±â¼÷»çÂõ¾î").getId());
		
		System.out.println(l.getLeagueEntryBySummonerId(Locale.KR, summonerModule.getSummonerByName(Locale.KR, "±â¼÷»çÂõ¾î").getId()));
		
	}
	
}
