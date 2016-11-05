/**
 * 
 */
package com.letscodes.dp.behavioral.Company;

/**
 * @author Azizur
 *
 */
/*
 * The client classes who want to be notified by the company has to implement Observer interface
 */
public interface Observer {
	public void update(String versionInfo);
}
