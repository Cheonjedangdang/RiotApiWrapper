package com.leelab.riotapi.apis;

import com.leelab.riotapi.apis.utils.ReflectionUtils;

public class RiotApi {
	private RestClient getter;
	private String apiKey;

	public <T> T callModule(Class<T> clazz) {
		T object = ReflectionUtils.createInstance(ReflectionUtils.getConstructor(clazz, String.class, RestClient.class), apiKey, getter);
		return object;
	}
	
	public RestClient getGetter() {
		return getter;
	}
	public void setGetter(RestClient getter) {
		this.getter = getter;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	
}
