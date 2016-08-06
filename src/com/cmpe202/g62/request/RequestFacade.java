package com.cmpe202.g62.request;

import com.cmpe202.g62.dao.Membership;
import com.cmpe202.g62.model.Member;
import com.cmpe202.g62.model.Ride;
import com.cmpe202.g62.ride.RideController;

public class RequestFacade{

	private Membership membership;
	
	public Member createMember(Member member){
		membership = new Membership();
		member = membership.createMember(member);
		return member;
	}
	
	public Member updateMember(Member member){
		membership = new Membership();
		member = membership.updateMember(member);
		return member;
	}
	
	public void deleteMember(String username){
		membership = new Membership();
		membership.deleteMember(username);
	}
	
	public Member getMember(String username){
		membership = new Membership();
		Member member = membership.getMember(username);
		return member;
	}
	
	public Ride manageRide(Ride ride){
		RideController rideController = new RideController();
		System.out.println("Scheduling Ride...");
		ride = rideController.receiveRide(ride);
		System.out.println("Dispatching Ride...");
		ride = rideController.processRide(ride);
		System.out.println("Completing Ride...");
		ride = rideController.completeRide(ride);
		return ride;
	}
	
	public void reportIssue(String message){
	}
	
}
