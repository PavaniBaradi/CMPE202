package com.cmpe202.g62.ride.impl;

import com.cmpe202.g62.model.Schedule;
import com.cmpe202.g62.schedule.Scheduling;

public class ParkingManager extends RideManager {

	public ParkingManager(Scheduling s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Schedule schedule(Schedule schedule) {
		// TODO Auto-generated method stub
		schedule.setParking(schedulePark());
		return schedule;
	}

}
