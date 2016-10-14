package com.leelab.riotapi;

import org.json.simple.JSONObject;

public interface RestClient {
	public JSONObject request(String url);
}
