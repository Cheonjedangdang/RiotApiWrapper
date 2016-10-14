package com.leelab.riotapi.utils;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public abstract class MappingStrategy {
	public abstract <T> ArrayList<T> howTomap(JSONArray arr, ArrayList<T> list);
	public abstract Object inlineMapping(JSONObject obj);
}
