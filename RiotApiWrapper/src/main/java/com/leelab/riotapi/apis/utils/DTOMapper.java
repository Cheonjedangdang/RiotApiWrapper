package com.leelab.riotapi.apis.utils;

import static com.leelab.riotapi.apis.utils.ReflectionUtils.*;

import java.util.ArrayList;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DTOMapper {
	
	@SuppressWarnings("unchecked")
	public static <T> T mappingForObject(JSONObject obj, Class<T> clazz, String...ignoreKeys) {
		
		T instance = createInstance(clazz);
		
		Set<String> keys = obj.keySet();
		boolean notIgnore = true;
		for(String key : keys)
		{
			for(String ignore : ignoreKeys)
			{
				if(ignore.equals(key))
				{
					notIgnore = false;
					break;
				}
			}
			
			if(notIgnore)
			{
				setField(instance, key, obj.get(key));
			}
			notIgnore = true;
		}
		
		return instance;
	}
	
	public static <T> T mappingForObject(JSONObject obj, Class<T> clazz,boolean isRequire, String...ignoreKeys) {
		
		T instance = createInstance(clazz);
		
		@SuppressWarnings("unchecked")
		Set<String> keys = obj.keySet();

		for(String key : keys)
		{
			for(String ignore : ignoreKeys)
			{
				if(ignore.equals(key))
				{
					setField(instance, key, obj.get(key));
				}
			}
		}
		
		return instance;
	}
	
	public static Object mappingObjectWithStrategy(JSONObject obj, InlineMapper mapper) {
		return mapper.inlineMapping(obj);
	}
	
	public static <T> ArrayList<T> mappingForList(JSONArray arr, Class<T> clazz) {
		ArrayList<T> list = new ArrayList<T>();
		for(Object o : arr)
		{
			list.add(mappingForObject((JSONObject)o, clazz));
		}
		return list;
	}
	
	public static <T> ArrayList<T> mappingForList(JSONArray arr, LoopMapper stg) {
		return stg.howTomap(arr, new ArrayList<T>());
	}
	
	@SuppressWarnings("unchecked")
	public static <T> ArrayList<T> inlineMappingForList(JSONArray arr, InlineMapper stg) {
		ArrayList<T> list = new ArrayList<T>();
		for(Object o : arr)
		{
			list.add((T)stg.inlineMapping((JSONObject)o));
		}
		return list;
	}
	
}
