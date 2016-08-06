package com.cmpe202.g62.ride;

import com.cmpe202.g62.model.Ride;

public interface RideState {
	
	public Ride receiveRide(Ride ride);
	public Ride processRide(Ride ride);
	public Ride completeRide(Ride ride);
	
	public State getState();
	public void setState(State s);

}
