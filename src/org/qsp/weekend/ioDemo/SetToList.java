package org.qsp.weekend.ioDemo;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetToList {

	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("Rachana");
		set.add("B");
		List<String> lst=new ArrayList<>();
		lst.addAll(set);
		System.out.println(set.getClass());//gives fully qualified class name
		for (String val : lst) {
			System.out.println(val);
		}
	}

}
