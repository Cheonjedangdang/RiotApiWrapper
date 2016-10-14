package com.leelab.riotapi.apis;

import org.json.simple.JSONObject;

public interface RestClient {
	public JSONObject request(String url);
}
