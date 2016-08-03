package com.cmpe202.g62.request.impl;

import com.cmpe202.g62.request.RequestInterface;
import com.cmpe202.g62.request.State;

public class WaitingState implements State{
	
	RequestInterface request;
	
	public WaitingState(RequestInterface request){
		this.request = request;
	}

	@Override
	public void receiveRequest() {
		// TODO Auto-generated method stub
		request.setState(new StartedState(request));
	}

	@Override
	public void processRequest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void completeRequest() {
		// TODO Auto-generated method stub
		
	}

}
