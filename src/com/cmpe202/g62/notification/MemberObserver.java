package com.cmpe202.g62.notification;

import com.cmpe202.g62.model.Member;
import com.cmpe202.g62.ride.impl.RideManager;

public class MemberObserver extends Observer {
	
	public MemberObserver(Member member){
		this.member = member;
		this.member.addObserver(this);
	}
	
	public MemberObserver(RideManager ride){
		this.ride = ride;
	}

	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}

}
