package com.leelab.riotapi.apis;

import com.leelab.riotapi.RestClient;
import com.leelab.riotapi.utils.ReflectionUtils;

public class RiotApi {
	private RestClient getter;
	private RiotAPISpec apiSpec;

	public <T> T callModule(Class<T> clazz) {
		try
		{
			T object = clazz.newInstance();
			ReflectionUtils.setField(object, "spec", apiSpec);
			return object;
		}
		catch (InstantiationException e)
		{
			e.printStackTrace();
		}
		catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public RestClient getGetter() {
		return getter;
	}
	public void setGetter(RestClient getter) {
		this.getter = getter;
	}
	public RiotAPISpec getApiSpec() {
		return apiSpec;
	}
	public void setApiSpec(RiotAPISpec apiSpec) {
		this.apiSpec = apiSpec;
	}
}
