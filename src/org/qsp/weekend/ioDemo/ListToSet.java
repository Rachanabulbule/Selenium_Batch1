package org.qsp.weekend.ioDemo;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class ListToSet {

	public static void main(String[] args) {
		List<String>  lst=new ArrayList<String>();
		lst.add("Rachana");
		lst.add("Bulbule");
		Set<String> set = new HashSet<>(lst);
		for (String val : set) {
			System.out.println(val);
		}
	}

}
