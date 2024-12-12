package com.jadecross.weather;

import java.time.Instant;

public class CurrentTemperature {
	private String timestamp;
	private String seoul;
	private String suwon;
	private String incheon;
	
	public CurrentTemperature() {
		this.timestamp = Instant.now().getEpochSecond() + "";
		
		this.seoul = String.format("%.2f", Math.random() * 40);
		this.suwon = String.format("%.2f", Math.random() * 40);
		this.incheon = String.format("%.2f", Math.random() * 40);
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getSeoul() {
		return seoul;
	}

	public void setSeoul(String seoul) {
		this.seoul = seoul;
	}

	public String getSuwon() {
		return suwon;
	}

	public void setSuwon(String suwon) {
		this.suwon = suwon;
	}

	public String getIncheon() {
		return incheon;
	}

	public void setIncheon(String incheon) {
		this.incheon = incheon;
	}
	
	
}
