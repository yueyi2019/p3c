package com.p3c.collector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubListTest {
	
	public static void main(String[] args) {
//		subList1();
		subList2();
	}
	
	public static void subList1() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list.toString());

		List a = list.subList(0, 1);
		
//		a.add("d");
		list.add("e");
		System.out.println(list.toString());
//		System.out.println(a.toString());
	}
	public static void subList2() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		List a = list.subList(1, 3);
		
		list.remove("b");
		System.out.println(list.toString());
		
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		
		Arrays.asList(a);
		
	}
}
