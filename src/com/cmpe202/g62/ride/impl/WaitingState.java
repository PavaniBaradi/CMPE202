package com.cmpe202.g62.ride.impl;

import com.cmpe202.g62.model.Ride;
import com.cmpe202.g62.model.Schedule;
import com.cmpe202.g62.ride.RideState;
import com.cmpe202.g62.ride.State;
import com.cmpe202.g62.schedule.Scheduling;
import com.cmpe202.g62.schedule.impl.ScheduleFuture;
import com.cmpe202.g62.schedule.impl.ScheduleNow;

public class WaitingState implements State{

	RideState rideState;

	public WaitingState(RideState rideState){
		this.rideState = rideState;
	}

	@Override
	public Ride receiveRide(Ride ride) {
		// TODO Auto-generated method stub
		Scheduling scheduling;
		RideManager rideManager;
		Schedule schedule;
		if(ride.getRideType().equals("now"))
			scheduling = new ScheduleNow();
		else
			scheduling = new ScheduleFuture();
		
		rideManager = new VehicleManager(scheduling);
		schedule = rideManager.schedule(ride.getSchedule());
		
		rideManager = new ParkingManager(scheduling);
		schedule = rideManager.schedule(schedule);
		
		rideState.setState(new StartedState(rideState));

		return ride;
	}

	@Override
	public Ride processRide(Ride ride) {
		// TODO Auto-generated method stub
		return ride;
	}

	@Override
	public Ride completeRide(Ride ride) {
		// TODO Auto-generated method stub
		return ride;
	}

}
