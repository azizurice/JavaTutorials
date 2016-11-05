package com.letscodes.dp.behavioral.Company;

import java.util.ArrayList;

/**
 * @author Azizur
 *
 */

public class CompanyAPIs implements Subject {
	public ArrayList<Observer> listOfObservers=new ArrayList<Observer>();
	private String apiVersion;
	private String platform;
	
	public CompanyAPIs(String platform, String apiVersion){
		this.platform = platform;
		this.setApiVersion(apiVersion);
	}

	 
	@Override
	public void registerObserver(Observer observer) {
		listOfObservers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		listOfObservers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : listOfObservers) {
			observer.update("API has been updated. Please see the company doc. The current version is :"+apiVersion);
		}
		
	}




	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
		notifyObservers();
	}
	
	

}
