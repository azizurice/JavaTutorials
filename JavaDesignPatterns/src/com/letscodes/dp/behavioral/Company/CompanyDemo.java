package com.letscodes.dp.behavioral.Company;

/**
 * @author Azizur
 *
 */
public class CompanyDemo {

	public static void main(String[] args) {
	// Subject : Who wants to notify
	CompanyAPIs companyAPIs = new CompanyAPIs("all", "0.0.1");
	
	// Observers : Who wants to be notified. must register themselves to the notifier. 
	WebClient webClient = new WebClient();
	AndroidClient androidClient = new AndroidClient();
	IOSClient iOSClient = new IOSClient();
	
	companyAPIs.registerObserver(webClient);
	companyAPIs.registerObserver(androidClient);
	companyAPIs.registerObserver(iOSClient);
	
	// Now whenever we update the api version,all the clients would automatically be notified.
	companyAPIs.setApiVersion("0.1.0");
	

	}

}
