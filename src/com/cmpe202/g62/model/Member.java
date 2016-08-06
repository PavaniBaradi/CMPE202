package com.cmpe202.g62.model;

import com.cmpe202.g62.notification.ObserverSubject;

public class Member extends ObserverSubject{
	private int memberId;
	private String userName;
	private String firstName;
	private String lastName;
	private String password;
	private String memberType;
	private String message;
	
	public Member(){
		
	}
	
	public Member(int memberId, String userName, String firstName, String lastName, String password,
			String memberType) {
		super();
		this.memberId = memberId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.memberType = memberType;
	}
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		notifyObservers(message);
	}
	
}
