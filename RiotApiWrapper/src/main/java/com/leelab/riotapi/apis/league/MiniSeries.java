package com.leelab.riotapi.apis.league;

public class MiniSeries {
	private long losses;
	private String progress;
	private long target;
	private long wins;
	
	public MiniSeries(){}

	public long getLosses() {
		return losses;
	}

	public void setLosses(long losses) {
		this.losses = losses;
	}

	public String getProgress() {
		return progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}

	public long getTarget() {
		return target;
	}

	public void setTarget(long target) {
		this.target = target;
	}

	public long getWins() {
		return wins;
	}

	public void setWins(long wins) {
		this.wins = wins;
	}

	@Override
	public String toString() {
		return "MiniSeries [losses=" + losses + ", progress=" + progress + ", target=" + target + ", wins=" + wins
				+ "]";
	}
}
