package com.leelab.riotapi.apis.champion;

public class Champion {
	
	private boolean rankedPlayEnabled;
	private boolean botEnabled;
	private boolean botMmEnabled;
	private boolean active;
	private boolean freeToPlay;
	private long id;
	
	public Champion(boolean rankedPlayEnabled, boolean botEnabled, boolean botMmEnabled, boolean active,
			boolean freeToPlay, long id) {
		super();
		this.rankedPlayEnabled = rankedPlayEnabled;
		this.botEnabled = botEnabled;
		this.botMmEnabled = botMmEnabled;
		this.active = active;
		this.freeToPlay = freeToPlay;
		this.id = id;
	}

	public boolean isRankedPlayEnabled() {
		return rankedPlayEnabled;
	}

	public void setRankedPlayEnabled(boolean rankedPlayEnabled) {
		this.rankedPlayEnabled = rankedPlayEnabled;
	}

	public boolean isBotEnabled() {
		return botEnabled;
	}

	public void setBotEnabled(boolean botEnabled) {
		this.botEnabled = botEnabled;
	}

	public boolean isBotMmEnabled() {
		return botMmEnabled;
	}

	public void setBotMmEnabled(boolean botMmEnabled) {
		this.botMmEnabled = botMmEnabled;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isFreeToPlay() {
		return freeToPlay;
	}

	public void setFreeToPlay(boolean freeToPlay) {
		this.freeToPlay = freeToPlay;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


}
