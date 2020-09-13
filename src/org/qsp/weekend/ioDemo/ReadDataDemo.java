package org.qsp.weekend.ioDemo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadDataDemo {

	public static void main(String[] args) {
		FileInputStream fsi=null;
		try {
			fsi=new FileInputStream("sData.txt");
			ObjectInputStream ois=new ObjectInputStream(fsi);
			Object o=ois.readObject();
			Student s=null;
			if(o instanceof Student){
				 s=(Student) o;
				 System.out.println(+s.roll+" "+s.name+" "+s.dept+" "+s.pecr);
				
			}
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
