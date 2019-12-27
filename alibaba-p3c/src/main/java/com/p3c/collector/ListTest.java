package com.p3c.collector;

import java.util.Arrays;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) {
		String[] strArray = new String[] {"1","2"};
		List<String> list = Arrays.asList(strArray);
		System.out.println(list.toString());
		
//		list.set(0, "3");
//		System.out.println(list.toString());
		
//		list.add("4");
		System.out.println(Arrays.toString(strArray));
		System.out.println(list.toString());
		strArray[0] = "4";
		System.out.println(Arrays.toString(strArray));
		System.out.println(list.toString());
	}
}
