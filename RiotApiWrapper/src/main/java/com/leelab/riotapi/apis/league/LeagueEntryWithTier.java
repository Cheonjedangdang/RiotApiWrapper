package com.leelab.riotapi.apis.league;

public class LeagueEntryWithTier {
	private LeagueEntry entry;
	private String tier;
	
	public LeagueEntryWithTier(){}

	public LeagueEntry getEntry() {
		return entry;
	}

	public void setEntry(LeagueEntry entry) {
		this.entry = entry;
	}

	public String getTier() {
		return tier;
	}

	public void setTier(String tier) {
		this.tier = tier;
	}

	@Override
	public String toString() {
		return "LeagueEntryWithTier [entry=" + entry + ", tier=" + tier + "]";
	}
	
	
}
