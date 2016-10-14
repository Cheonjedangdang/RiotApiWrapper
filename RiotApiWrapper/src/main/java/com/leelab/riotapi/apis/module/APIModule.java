package com.leelab.riotapi.apis.module;

import com.leelab.riotapi.apis.RestClient;

public abstract class APIModule {
	
	private String key;
	private RestClient client;
	
	public APIModule(String key, RestClient client) {
		this.key = key;
		this.client = client;
	}
	
	public String getKey() {
		return key;
	}

	public RestClient getClient() {
		return client;
	}
	
}
