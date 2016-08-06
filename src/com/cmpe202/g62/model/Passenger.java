package com.cmpe202.g62.model;

public class Passenger extends Member {
	
	public Passenger(){
		super();
		setMemberType("Passenger");
	}
	public Passenger(int memberId, String userName, String firstName, String lastName, String password,
			String memberType) {
		super(memberId, userName, firstName, lastName, password, "Passenger");
	}

}
