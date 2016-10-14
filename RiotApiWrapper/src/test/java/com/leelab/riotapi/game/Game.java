package com.leelab.riotapi.game;

import java.util.ArrayList;

public class Game {
	private long championId;
	private long createDate;
	private ArrayList<FellowPlayer> fellowPlayers;
	private long gameId;
	private String gameMode;
	private String gameType;
	private boolean invalid;
	private long ipEarned;
	private long level;
	private long mapId;
	private long spell1;
	private long spell2;
	private RawStats stats;
	private String subType;
	private long teamId;
	
	public Game(){}

	public long getChampionId() {
		return championId;
	}

	public void setChampionId(long championId) {
		this.championId = championId;
	}

	public long getCreateDate() {
		return createDate;
	}

	public void setCreateDate(long createDate) {
		this.createDate = createDate;
	}

	public ArrayList<FellowPlayer> getFellowPlayers() {
		return fellowPlayers;
	}

	public void setFellowPlayers(ArrayList<FellowPlayer> fellowPlayers) {
		this.fellowPlayers = fellowPlayers;
	}

	public long getGameId() {
		return gameId;
	}

	public void setGameId(long gameId) {
		this.gameId = gameId;
	}

	public String getGameMode() {
		return gameMode;
	}

	public void setGameMode(String gameMode) {
		this.gameMode = gameMode;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public boolean isInvalid() {
		return invalid;
	}

	public void setInvalid(boolean invalid) {
		this.invalid = invalid;
	}

	public long getIpEarned() {
		return ipEarned;
	}

	public void setIpEarned(long ipEarned) {
		this.ipEarned = ipEarned;
	}

	public long getLevel() {
		return level;
	}

	public void setLevel(long level) {
		this.level = level;
	}

	public long getMapId() {
		return mapId;
	}

	public void setMapId(long mapId) {
		this.mapId = mapId;
	}

	public long getSpell1() {
		return spell1;
	}

	public void setSpell1(long spell1) {
		this.spell1 = spell1;
	}

	public long getSpell2() {
		return spell2;
	}

	public void setSpell2(long spell2) {
		this.spell2 = spell2;
	}

	public RawStats getStats() {
		return stats;
	}

	public void setStats(RawStats stats) {
		this.stats = stats;
	}

	public String getSubType() {
		return subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public long getTeamId() {
		return teamId;
	}

	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}

	@Override
	public String toString() {
		return "Game [championId=" + championId + ", createDate=" + createDate + ", fellowPlayers=" + fellowPlayers
				+ ", gameId=" + gameId + ", gameMode=" + gameMode + ", gameType=" + gameType + ", invalid=" + invalid
				+ ", ipEarned=" + ipEarned + ", level=" + level + ", mapId=" + mapId + ", spell1=" + spell1
				+ ", spell2=" + spell2 + ", stats=" + stats + ", subType=" + subType + ", teamId=" + teamId + "]";
	}
}
