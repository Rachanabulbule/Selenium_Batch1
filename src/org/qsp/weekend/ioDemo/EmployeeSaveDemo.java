package org.qsp.weekend.ioDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSaveDemo {
	public static void main(String[] args) {
		Employee e= new Employee();
		e.name="Rachana B";
		e.designation="SE";
		e.empId=170480;
		e.salary=30000;
		FileOutputStream fout;
		ObjectOutputStream  ops;
		try {
			fout = new FileOutputStream("eData.txt");
			ops=new ObjectOutputStream(fout);
			ops.writeObject(e);
			ops.close();
		} catch (Exception e1) {  //IOException
			e1.printStackTrace();
		}
		System.out.println("App End");
	
	}
	

}
