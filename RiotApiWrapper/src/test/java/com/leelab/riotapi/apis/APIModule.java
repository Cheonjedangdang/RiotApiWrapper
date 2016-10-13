package com.leelab.riotapi.apis;

import com.leelab.riotapi.RestClient;

public abstract class APIModule {
	
	private RiotAPISpec spec;
	private RestClient client;
	
	public APIModule(RiotAPISpec spec, RestClient client) {
		this.spec = spec;
		this.client = client;
	}
	
	public RiotAPISpec getSpec() {
		return spec;
	}

	public RestClient getClient() {
		return client;
	}
	
}
