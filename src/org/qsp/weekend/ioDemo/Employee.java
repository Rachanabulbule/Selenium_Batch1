package org.qsp.weekend.ioDemo;

import java.io.Serializable;

public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int empId;
	String name,designation;
	double salary;
}
//Previously giving one warning for Employee class e.g. see in Student class.
//so mouse over on class name add default serial session id.