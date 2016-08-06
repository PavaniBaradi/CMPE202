package com.cmpe202.g62.dispatch;

import com.cmpe202.g62.model.Location;
import com.cmpe202.g62.model.Ride;
import com.cmpe202.g62.model.Route;

public class Dispatcher {
	
	public void dispatchRide(Ride ride){
		Route route = ride.getRoute();
		for (Location location : route.getRoute()) {
			System.out.println(location.toString());
		}
	}

}
