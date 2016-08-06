package com.cmpe202.g62.model;

public class Vehicle {
	private String vehicleId;
	private String vehicleType;
	private String vehicleName;
	private Location currentlocation;
	private Member owner;
	
	public Vehicle(String vehicleId, String vehicleType, String vehicleName, Location currentlocation, Member owner) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleType = vehicleType;
		this.vehicleName = vehicleName;
		this.currentlocation = currentlocation;
		this.owner = owner;
	}
	
	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public Location getCurrentlocation() {
		return currentlocation;
	}
	public void setCurrentlocation(Location currentlocation) {
		this.currentlocation = currentlocation;
	}

	public Member getOwner() {
		return owner;
	}

	public void setOwner(Member owner) {
		this.owner = owner;
	}
}
