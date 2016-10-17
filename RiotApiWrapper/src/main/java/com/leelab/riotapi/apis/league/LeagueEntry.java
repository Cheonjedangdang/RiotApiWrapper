package com.leelab.riotapi.apis.league;

public class LeagueEntry {
	private String division;
	private boolean isFreshBlood;
	private boolean isHotStreak;
	private boolean isInactive;
	private boolean isVeteran;
	private long leaguePoints;
	private long losses;
	private MiniSeries miniSeries;
	private String playerOrTeamId;
	private String playerOrTeamName;
	private String playstyle;
	private long wins;
	
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public boolean isFreshBlood() {
		return isFreshBlood;
	}
	public void setFreshBlood(boolean isFreshBlood) {
		this.isFreshBlood = isFreshBlood;
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
	public long getLeaguePoints() {
		return leaguePoints;
	}
	public void setLeaguePoints(long leaguePoints) {
		this.leaguePoints = leaguePoints;
	}
	public long getLosses() {
		return losses;
	}
	public void setLosses(long losses) {
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
	public long getWins() {
		return wins;
	}
	public void setWins(long wins) {
		this.wins = wins;
	}
	@Override
	public String toString() {
		return "LeagueEntry [division=" + division + ", isFreshBlood=" + isFreshBlood + ", isHotStreak=" + isHotStreak
				+ ", isInactive=" + isInactive + ", isVeteran=" + isVeteran + ", leaguePoints=" + leaguePoints
				+ ", losses=" + losses + ", miniSeries=" + miniSeries + ", playerOrTeamId=" + playerOrTeamId
				+ ", playerOrTeamName=" + playerOrTeamName + ", playstyle=" + playstyle + ", wins=" + wins + "]";
	}
	
}
