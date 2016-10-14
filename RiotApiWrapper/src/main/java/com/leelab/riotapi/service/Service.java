package com.leelab.riotapi.service;

import com.leelab.riotapi.apis.RiotApi;

public abstract class Service {
	
	public void accessDatabase(){};
	
	public abstract void handleRequest(RiotApi api, Object...params);
	
	public void execute(RiotApi api, Object...params) {
		accessDatabase();
		handleRequest(api, params);
	}
}
