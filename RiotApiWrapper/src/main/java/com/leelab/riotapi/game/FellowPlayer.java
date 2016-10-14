package com.leelab.riotapi.game;

public class FellowPlayer {
	private long championId;
	private long teamId;
	private long summonerId;
	
	public FellowPlayer(){}

	public FellowPlayer(long championId, long teamId, long summonerId) {
		this.championId = championId;
		this.teamId = teamId;
		this.summonerId = summonerId;
	}

	public long getChampionId() {
		return championId;
	}

	public void setChampionId(long championId) {
		this.championId = championId;
	}

	public long getTeamId() {
		return teamId;
	}

	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}

	public long getSummonerId() {
		return summonerId;
	}

	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}
	
}
