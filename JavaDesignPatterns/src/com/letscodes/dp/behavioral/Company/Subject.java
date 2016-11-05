/**
 * 
 */
package com.letscodes.dp.behavioral.Company;

/**
 * @author Azizur
 *
 */
/*
 * In Observer pattern, Subject interface should have at least three methods by which an observer can 
 * be registered, notified and removed. The class which want to notify will implement the subject interface.
 */


public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
	

}
