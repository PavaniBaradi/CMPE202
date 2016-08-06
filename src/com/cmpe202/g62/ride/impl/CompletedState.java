package com.cmpe202.g62.ride.impl;

import com.cmpe202.g62.model.Ride;
import com.cmpe202.g62.ride.RideState;
import com.cmpe202.g62.ride.State;

public class CompletedState implements State {
	RideState rideState;

	public CompletedState(RideState request) {
		super();
		this.rideState = request;
	}

	@Override
	public Ride processRide(Ride ride) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ride completeRide(Ride ride) {
		// TODO Auto-generated method stub
		rideState.setState(new WaitingState(rideState));
		return ride;
	}

	@Override
	public Ride receiveRide(Ride ride) {
		// TODO Auto-generated method stub
		return ride;
	}

}
