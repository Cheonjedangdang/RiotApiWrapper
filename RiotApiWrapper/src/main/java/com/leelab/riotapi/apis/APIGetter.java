package com.leelab.riotapi.apis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class APIGetter implements RestClient {
	
	@Override
	public JSONObject request(String url) {
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet get = new HttpGet(url);
		CloseableHttpResponse response = null;
		try
		{
			response = client.execute(get);
			return parseResponse(response);
		}
		catch (ClientProtocolException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(response!=null)response.close();
			}
			catch (IOException e){}
			
			try
			{
				client.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			
		}
		return null;
	}
	
	public JSONObject parseResponse(CloseableHttpResponse response) {

		BufferedReader reader = null;
		InputStream content = null;
		try
		{
			content = response.getEntity().getContent();
			reader = new BufferedReader(new InputStreamReader(content,"UTF-8"));
			StringBuilder jsonBuilder = new StringBuilder();
			String input = null;
			while((input=reader.readLine())!=null)
			{
				jsonBuilder.append(input);
			}
			return (JSONObject)JSONValue.parse(jsonBuilder.toString());
		}
		catch (IllegalStateException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				content.close();
			}
			catch (IOException e1){}
			
			try
			{
				if(reader!=null)reader.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		return null;
	}
	
	
}
