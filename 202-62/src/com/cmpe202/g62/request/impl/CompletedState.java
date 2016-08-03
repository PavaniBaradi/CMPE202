package com.cmpe202.g62.request.impl;

import com.cmpe202.g62.request.RequestInterface;
import com.cmpe202.g62.request.State;

public class CompletedState implements State {
	RequestInterface request;

	public CompletedState(RequestInterface request) {
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

	}

	@Override
	public void completeRequest() {
		// TODO Auto-generated method stub
		request.setState(new WaitingState(request));
	}

}
