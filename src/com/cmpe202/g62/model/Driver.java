package com.cmpe202.g62.model;

public class Driver extends Member {
	
	private Vehicle vehicle;
	
	public Driver(){
		super();
		this.setMemberType("Driver");
	}
	public Driver(int memberId, String userName, String firstName, String lastName, String password,
			String memberType, Vehicle vehicle) {
		super(memberId, userName, firstName, lastName, password, "Driver");
		this.vehicle = vehicle;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
