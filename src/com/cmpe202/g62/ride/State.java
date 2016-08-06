package com.cmpe202.g62.ride;

import com.cmpe202.g62.model.Ride;

public interface State {
	
	public Ride receiveRide(Ride ride);
	public Ride processRide(Ride ride);
	public Ride completeRide(Ride ride);

}
