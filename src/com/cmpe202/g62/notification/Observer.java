package com.cmpe202.g62.notification;

import com.cmpe202.g62.model.Member;
import com.cmpe202.g62.ride.impl.RideManager;

public abstract class Observer {
	
	protected Member member;
	protected RideManager ride;
	
	public abstract void update(String message);

}
