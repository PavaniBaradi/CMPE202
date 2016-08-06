package com.cmpe202.g62.model;

public class Schedule {
	private int scheduleId;
	private String date;
	private String time;
	private Vehicle vehicle;
	private Member driver;
	private Member passenger;
	private Location parking;
	private Location source;
	private Location destination;
	
	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Schedule(int scheduleId, String date, String time, Vehicle vehicle, Member driver, Member passenger,
			Location parking, Location source, Location destination) {
		super();
		this.scheduleId = scheduleId;
		this.date = date;
		this.time = time;
		this.vehicle = vehicle;
		this.driver = driver;
		this.passenger = passenger;
		this.parking = parking;
		this.source = source;
		this.destination = destination;
	}

	public int getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Location getParking() {
		return parking;
	}
	public void setParking(Location parking) {
		this.parking = parking;
	}
	public Member getDriver() {
		return driver;
	}
	public void setDriver(Member driver) {
		this.driver = driver;
	}
	public Member getPassenger() {
		return passenger;
	}
	public void setPassenger(Member passenger) {
		this.passenger = passenger;
	}
	public Location getSource() {
		return source;
	}
	public void setSource(Location source) {
		this.source = source;
	}
	public Location getDestination() {
		return destination;
	}
	public void setDestination(Location destination) {
		this.destination = destination;
	}

}
