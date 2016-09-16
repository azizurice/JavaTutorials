package com.letscodes.dp.creational.factory.plan;

public abstract class Plan {
	protected double rate;
	abstract void setRate();
	void displayBill(double units){
		System.out.println("The bill is :"+units*rate);
	}
	

}
