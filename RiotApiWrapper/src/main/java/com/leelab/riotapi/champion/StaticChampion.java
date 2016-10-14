package com.leelab.riotapi.champion;

public class StaticChampion {
	private long id;
	private String key;
	private String name;
	private String title;
	
	public StaticChampion(){}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "StaticChampion [id=" + id + ", key=" + key + ", name=" + name + ", title=" + title + "]";
	}
	
}
