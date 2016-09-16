package com.letscodes.dp.creational.factory.plan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElectricBillApp {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the type of customer:");
		String customer=br.readLine();
		
		System.out.println("Enter the number of units the "+ customer +" customer burns:");
		double units=Double.parseDouble(br.readLine());
		Plan customerPlan=PlanFactory.getPlan(customer);
		customerPlan.setRate();
		customerPlan.displayBill(units);

	}
	
	

}
