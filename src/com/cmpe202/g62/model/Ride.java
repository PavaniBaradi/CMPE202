package com.cmpe202.g62.model;

public class Ride {

	private int rideId;
	private Schedule schedule;
	private Location source;
	private Location destination;
	private Member passenger;
	private int amount;
	private String rideType;
	private Route route;
	
	
	public Ride() {
		super();
	}
	
	public Ride(int rideId, Schedule schedule, Location source, Location destination,
			Member passenger, int amount, String rideType, Route route) {
		super();
		this.rideId = rideId;
		this.schedule = schedule;
		this.source = source;
		this.destination = destination;
		this.passenger = passenger;
		this.amount = amount;
		this.rideType = rideType;
		this.route = route;
	}
	public int getRideId() {
		return rideId;
	}
	public void setRideId(int rideId) {
		this.rideId = rideId;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
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
	public Member getPassenger() {
		return passenger;
	}
	public void setPassenger(Member passenger) {
		this.passenger = passenger;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getRideType() {
		return rideType;
	}

	public void setRideType(String rideType) {
		this.rideType = rideType;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}
	
}
