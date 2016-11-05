/**
 * 
 */
package com.letscodes.dp.behavioral.Company;

/**
 * @author Azizur
 *
 */
public class AndroidClient implements Observer{

	@Override
	public void update(String versionInfo) {
		// You can implement it whatever way you want IOSclent would be notified.
	    //You can send email or send a push notification from here 
		
		System.out.println("Dear Android Client :"+ versionInfo);
		
	}

}
