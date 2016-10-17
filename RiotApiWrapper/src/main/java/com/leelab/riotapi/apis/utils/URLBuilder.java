package com.leelab.riotapi.apis.utils;

public class URLBuilder {
	private StringBuffer urlBuffer;
	
	public URLBuilder(String protocol, String domain) {
		urlBuffer = new StringBuffer();
		urlBuffer.append(protocol).append("://").append(domain).append("/");
	}
	
	public URLBuilder slash() {
		addWithOutSlash("/");
		return this;
	}
	
	public URLBuilder add(Object path) {
		urlBuffer.append(path).append("/");
		return this;
	}
	
	public URLBuilder addWithOutSlash(Object path) {
		urlBuffer.append(path);
		return this;
	}
	
	public URLBuilder params() {
		addWithOutSlash("?");
		return this;
	}
	
	public URLBuilder addParam(String key, Object value) {
		addWithOutSlash(key);
		urlBuffer.append("=");
		addWithOutSlash(value);
		return  this;
	}
	
	public URLBuilder and() {
		addWithOutSlash("&");
		return  this;
	}
	
	public String build() {
		return urlBuffer.toString();
	}
}
