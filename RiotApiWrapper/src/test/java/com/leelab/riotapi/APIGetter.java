package com.leelab.riotapi;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class APIGetter implements RestClient {
	private CloseableHttpClient client;
	
	public APIGetter() {
		client = HttpClients.createDefault();
	}
	
	/*
	 * https://kr.api.pvp.net/api/lol/kr/v1.4/summoner/by-name/±â¼÷»çÂõ¾î?api_key=2bb3c69c-85bd-4e5e-addf-4ee9768b8505
	 * */
	
	@Override
	public void request(String url) {
		
		
	}
	
}
