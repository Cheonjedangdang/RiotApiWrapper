package com.leelab.riotapi.apis.league;

public class LeagueEntry {
	private String divition;
	private boolean isFreshBood;
	private boolean isHotStreak;
	private boolean isInactive;
	private boolean isVeteran;
	private int leaguePoints;
	private int losses;
	private MiniSeries miniSeries;
	private String playerOrTeamId;
	private String playerOrTeamName;
	private String playstyle;
	private int wins;
	
	public String getDivition() {
		return divition;
	}
	public void setDivition(String divition) {
		this.divition = divition;
	}
	public boolean isFreshBood() {
		return isFreshBood;
	}
	public void setFreshBood(boolean isFreshBood) {
		this.isFreshBood = isFreshBood;
	}
	public boolean isHotStreak() {
		return isHotStreak;
	}
	public void setHotStreak(boolean isHotStreak) {
		this.isHotStreak = isHotStreak;
	}
	public boolean isInactive() {
		return isInactive;
	}
	public void setInactive(boolean isInactive) {
		this.isInactive = isInactive;
	}
	public boolean isVeteran() {
		return isVeteran;
	}
	public void setVeteran(boolean isVeteran) {
		this.isVeteran = isVeteran;
	}
	public int getLeaguePoints() {
		return leaguePoints;
	}
	public void setLeaguePoints(int leaguePoints) {
		this.leaguePoints = leaguePoints;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public MiniSeries getMiniSeries() {
		return miniSeries;
	}
	public void setMiniSeries(MiniSeries miniSeries) {
		this.miniSeries = miniSeries;
	}
	public String getPlayerOrTeamId() {
		return playerOrTeamId;
	}
	public void setPlayerOrTeamId(String playerOrTeamId) {
		this.playerOrTeamId = playerOrTeamId;
	}
	public String getPlayerOrTeamName() {
		return playerOrTeamName;
	}
	public void setPlayerOrTeamName(String playerOrTeamName) {
		this.playerOrTeamName = playerOrTeamName;
	}
	public String getPlaystyle() {
		return playstyle;
	}
	public void setPlaystyle(String playstyle) {
		this.playstyle = playstyle;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	
}
