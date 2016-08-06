package com.cmpe202.g62.ride.impl;

import com.cmpe202.g62.dispatch.Dispatcher;
import com.cmpe202.g62.model.Ride;
import com.cmpe202.g62.ride.RideState;
import com.cmpe202.g62.ride.State;

public class StartedState implements State {
	RideState rideState;
	
	public StartedState(RideState ride) {
		super();
		this.rideState = ride;
	}

	@Override
	public Ride receiveRide(Ride ride) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ride processRide(Ride ride) {
		// TODO Auto-generated method stub
		Dispatcher dispatcher = new Dispatcher();
		if(ride.getRideId()>0){
			dispatcher.dispatchRide(ride);
			rideState.setState(new CompletedState(rideState));
		}else {
			rideState.setState(new WaitingState(rideState));
		}
		
		return ride;
	}

	@Override
	public Ride completeRide(Ride ride) {
		// TODO Auto-generated method stub
		return ride;
	}

}
