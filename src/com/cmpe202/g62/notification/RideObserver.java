package com.cmpe202.g62.notification;

import com.cmpe202.g62.ride.impl.RideManager;

public class RideObserver extends Observer {
	
	public RideObserver(RideManager ride){
		this.ride = ride;
	}

	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);

	}

}
