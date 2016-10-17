package com.leelab.riotapi.apis.league;

import java.util.ArrayList;

public class League {
	private ArrayList<LeagueEntry> entries;
	private String name;
	private String participantId;
	private String queue;
	private String tier;
	
	public ArrayList<LeagueEntry> getEntries() {
		return entries;
	}
	public void setEntries(ArrayList<LeagueEntry> entries) {
		this.entries = entries;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParticipantId() {
		return participantId;
	}
	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}
	public String getQueue() {
		return queue;
	}
	public void setQueue(String queue) {
		this.queue = queue;
	}
	public String getTier() {
		return tier;
	}
	public void setTier(String tier) {
		this.tier = tier;
	}
	
	
}
