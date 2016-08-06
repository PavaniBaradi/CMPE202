package com.cmpe202.g62.notification;

import java.util.ArrayList;

public class ObserverSubject {
	
	private ArrayList<Observer> notifications = new ArrayList<Observer>();

	public void addObserver(Observer n){
		notifications.add(n);
	}
	
	public void removeObserver(Observer n){
		notifications.remove(n);
	}
	
	public void notifyObservers(String message){
		for (Observer notification : notifications) {
			notification.update(message);
		}
	}

}
