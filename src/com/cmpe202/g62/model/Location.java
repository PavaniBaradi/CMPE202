package com.cmpe202.g62.model;

public class Location {
	private int latitude;
	private int longitude;
	
	public Location(int latitude, int longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public int getLattitude() {
		return latitude;
	}
	public void setLattitude(int lattitude) {
		this.latitude = lattitude;
	}
	public int getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	
	public String toString(){
		return "Latitude "+this.latitude + "longitude "+this.longitude;
	}

}
