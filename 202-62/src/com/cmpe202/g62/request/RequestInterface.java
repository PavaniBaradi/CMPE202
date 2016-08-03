package com.cmpe202.g62.request;

public interface RequestInterface {
	
	public void receiveRequest();
	public void processRequest();
	public void completeRequest();
	
	public State getState();
	public void setState(State s);

}
