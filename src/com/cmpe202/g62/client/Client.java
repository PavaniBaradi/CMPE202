package com.cmpe202.g62.client;

import com.cmpe202.g62.model.Member;
import com.cmpe202.g62.request.RequestFacade;

public class Client {
	
	static RequestFacade request;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Member(0, "pavanibaradi", "Pavani", "Baradi", "password1", "Passenger");
		request = new RequestFacade();
		m = request.createMember(m);
	}

}
