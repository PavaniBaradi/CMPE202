package com.cmpe202.g62.model;

import java.util.LinkedList;
import java.util.List;

public class Route {
	
	private List<Location> route;
	
	public Route(){
		route = new LinkedList<Location>();
	}

	public List<Location> getRoute() {
		return route;
	}

	public void setRoute(List<Location> route) {
		this.route = route;
	}

}
