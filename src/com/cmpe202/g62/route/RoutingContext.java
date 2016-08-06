package com.cmpe202.g62.route;

import com.cmpe202.g62.route.impl.DistanceRouting;
import com.cmpe202.g62.route.impl.TimedRouting;

public class RoutingContext {

	private RoutingStrategy routingStrategy;

	public void route(){

	}

	public RoutingStrategy setRoutingStrategy(String strategy){
		switch(strategy){
		case "time": 
			routingStrategy = new TimedRouting();
			break;
		case "distance": 
			routingStrategy = new DistanceRouting();
			break;
		default : break;
		}
		return routingStrategy;
	}

}
