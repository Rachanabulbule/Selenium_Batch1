package org.qsp.weekend.ioDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSaveDemo {

	public static void main(String[] args) throws IOException {
		Student s= new Student();
		s.name="Rachana";
		s.dept="CS";
		s.roll=1;
		s.pecr=70.3;
		FileOutputStream fout=new FileOutputStream("sData.txt");
		ObjectOutputStream ops=new ObjectOutputStream(fout);
		ops.writeObject(s);
		ops.close();
		System.out.println("App End");
	
	}
	
}
