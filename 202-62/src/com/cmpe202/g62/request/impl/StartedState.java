package com.cmpe202.g62.request.impl;

import com.cmpe202.g62.request.RequestInterface;
import com.cmpe202.g62.request.State;

public class StartedState implements State {
	RequestInterface request;
	
	

	public StartedState(RequestInterface request) {
		super();
		this.request = request;
	}

	@Override
	public void receiveRequest() {
		// TODO Auto-generated method stub

	}

	@Override
	public void processRequest() {
		// TODO Auto-generated method stub
		request.setState(new CompletedState(request));
	}

	@Override
	public void completeRequest() {
		// TODO Auto-generated method stub

	}

}
