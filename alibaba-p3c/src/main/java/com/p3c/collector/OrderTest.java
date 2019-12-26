package com.p3c.collector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("b");
		arrayList.add("c");
		arrayList.add("a");
		arrayList.add("a");
		for (int i = 0; i < 10; i++) {
			System.out.println(arrayList.toString());
		}
		
//		HashMap<String, String> map = new HashMap<>();
//		map.put("a", "a");
//		map.put("1b", "b");
//		map.put("c", "c");
//		map.put("d", "d");
//		for (int i = 0; i < 100; i++) {
//			System.out.println(map.toString());
//		}
		
		Set<String> set = new HashSet<>(arrayList);
		System.out.println(set.toString());
	}

}
