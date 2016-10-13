package com.leelab.riotapi.apis;

public class RiotAPISpec {
	public String api_key;
	public String version;
	public String api_sever = "https://%s.api.pvp.net/api/lol/%s/%s";
			
	public String generate(Locale locale) {
		String localeStr = locale.toString().toLowerCase();
		return String.format(api_sever, localeStr, localeStr, version);
	}
	
	public String getApi_key() {
		return api_key;
	}
	public void setApi_key(String api_key) {
		this.api_key = api_key;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getApi_sever() {
		return api_sever;
	}
	public void setApi_sever(String api_sever) {
		this.api_sever = api_sever;
	}
}
