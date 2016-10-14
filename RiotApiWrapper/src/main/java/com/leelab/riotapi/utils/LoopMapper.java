package com.leelab.riotapi.utils;

import org.json.simple.JSONObject;

public abstract class LoopMapper extends MappingStrategy {
	@Override
	public Object inlineMapping(JSONObject obj) {
		return null;
	}
}
