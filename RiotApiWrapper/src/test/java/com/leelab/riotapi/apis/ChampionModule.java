package com.leelab.riotapi.apis;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.leelab.riotapi.RestClient;
import com.leelab.riotapi.champion.Champion;
import com.leelab.riotapi.utils.DTOMapper;

public class ChampionModule extends APIModule{
   
   public ChampionModule(RiotAPISpec spec, RestClient client) {
      super(spec, client);
   }
   
   public ArrayList<Champion> getChampion(Locale locale, boolean freeToPlay){
      String requestURL = getSpec().generate(locale,"v1.2")+"/champion?freeToPlay="+freeToPlay+"&api_key="+getSpec().getApi_key();
      JSONObject obj = getClient().request(requestURL);
      System.out.println(obj.toJSONString());
      //System.out.println(spec.generate(locale)+"/champion?freeToPlay="+freeToPlay+"&api_key="+spec.getApi_key());
      return DTOMapper.mappingForList((JSONArray)obj.get("champions"), Champion.class);
   }

   public Champion getChampionById(Locale locale, long id){
      String requestURL = getSpec().generate(locale,"v1.2")+"/champion/"+id+"?api_key="+getSpec().getApi_key();
      System.out.println(requestURL);
      JSONObject obj = getClient().request(requestURL);
      System.out.println(obj.toJSONString());
      return DTOMapper.mappingForObject(obj, Champion.class);
   }
   
}
