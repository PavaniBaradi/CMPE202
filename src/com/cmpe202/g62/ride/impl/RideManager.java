package com.cmpe202.g62.ride.impl;

import com.cmpe202.g62.model.Location;
import com.cmpe202.g62.model.Schedule;
import com.cmpe202.g62.model.Vehicle;
import com.cmpe202.g62.schedule.Scheduling;

public abstract class RideManager //implements RideInterface 
{
	protected Scheduling scheduling;
	//private State state;
	
//	public RideManager(){
//		state = new WaitingState(this);
//	}
	
//	@Override
//	public Ride receiveRide(Ride ride) {
//		// TODO Auto-generated method stub
//		ride = state.receiveRide(ride);
//		return ride;
//	}
//
//	@Override
//	public Ride processRide(Ride ride) {
//		// TODO Auto-generated method stub
//		ride = state.processRide(ride);
//		return ride;
//	}
//
//	@Override
//	public Ride completeRide(Ride ride) {
//		// TODO Auto-generated method stub
//		ride = state.completeRide(ride);
//		return ride;
//	}
//
//	@Override
//	public State getState() {
//		// TODO Auto-generated method stub
//		return state;
//	}
//
//	@Override
//	public void setState(State s) {
//		// TODO Auto-generated method stub
//		this.state = s;
//	}
	
	public abstract Schedule schedule(Schedule schedule);
	
	public RideManager(Scheduling s){
		scheduling = s;
		//state = new WaitingState(this);
	}

	protected Vehicle scheduleVehicle(){
		return scheduling.scheduleVehicle();
	}
	
	protected Location schedulePark(){
		return scheduling.schedulePark();
	}

}
