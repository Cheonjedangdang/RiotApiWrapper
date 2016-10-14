package com.leelab.riotapi.summoner;

public class Summoner {
	private long profileIconId;
	private long revisionDate;
	private String name;
	private long id;
	private long summonerLevel;
	
	public Summoner(){}
	
	public Summoner(long profileIconId, long revisionDate, String name, long id, long summonerLevel) {
		this.profileIconId = profileIconId;
		this.revisionDate = revisionDate;
		this.name = name;
		this.id = id;
		this.summonerLevel = summonerLevel;
	}
	
	public long getProfileIconId() {
		return profileIconId;
	}
	public void setProfileIconId(long profileIconId) {
		this.profileIconId = profileIconId;
	}
	public long getRevisionDate() {
		return revisionDate;
	}
	public void setRevisionDate(long revisionDate) {
		this.revisionDate = revisionDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getSummonerLevel() {
		return summonerLevel;
	}
	public void setSummonerLevel(long summonerLevel) {
		this.summonerLevel = summonerLevel;
	}
	@Override
	public String toString() {
		return "Summoner [profileIconId=" + profileIconId + ", revisionDate=" + revisionDate + ", name=" + name
				+ ", id=" + id + ", summonerLevel=" + summonerLevel + "]";
	}
}
