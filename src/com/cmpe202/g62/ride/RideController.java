package com.cmpe202.g62.ride;

import com.cmpe202.g62.model.Ride;
import com.cmpe202.g62.ride.impl.WaitingState;

public class RideController implements RideState{
	private State state;

//	public Ride scheduleRide(Ride ride){
//		ride = rideManager.receiveRide(ride);
//		return ride;
//	}
//	
//	public Ride dispatchRide(Ride ride){
//		if(ride.getRideId()>0){
//			ride = rideManager.processRide(ride);
//		}
//		return ride;
//	}
//	
//	public Ride finishRide(Ride ride){
//		rideManager.completeRide(ride);
//		return ride;
//	}
	
	public RideController() {
		// TODO Auto-generated constructor stub
		this.state = new WaitingState(this);
	}
	
	@Override
	public Ride receiveRide(Ride ride) {
		// TODO Auto-generated method stub
		ride = state.receiveRide(ride);
		return ride;
	}

	@Override
	public Ride processRide(Ride ride) {
		// TODO Auto-generated method stub
		ride = state.processRide(ride);
		return ride;
	}

	@Override
	public Ride completeRide(Ride ride) {
		// TODO Auto-generated method stub
		ride = state.completeRide(ride);
		return ride;
	}

	@Override
	public State getState() {
		// TODO Auto-generated method stub
		return state;
	}

	@Override
	public void setState(State s) {
		// TODO Auto-generated method stub
		this.state = s;
	}

}
