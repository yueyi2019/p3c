package com.p3c.collector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("0");
		list.add("1");
		
		list.add("2");
//		list.add("7");
		list.add("3");
		list.add("4");
		
//		List<String> sub = list.subList(1, 2);
//		sub.set(0, "8");
		System.out.println(list.toString());
//		
//		Object[] olist = list.toArray();
//		String[] slist = (String[])olist;
//		
		Map<String, String> map = new HashMap<String, String>();
		map.put("100", "a");
		map.put("2", "b");
		map.put("r", "c");
		map.put("9m", "d");
		map.put("5", "e");
		
		System.out.println(map.toString());
//		Set<String> set = map.keySet();
////		set.add("4");
//		Collection<String> listCollection = map.values();
//		Set<Entry<String, String>> entrys = map.entrySet();
//		for (Entry<String, String> entry : entrys) {
//			String key = entry.getKey();
//			String value = entry.getValue();
//		}
//		
//		System.out.println(map.toString());
		
//		String[] a = new String[] {"a","b"};
//		List<String> b = Arrays.asList(a);
//		System.out.println(b.toString());
//		a[0]="u";
//		System.out.println(b.toString());
//		b.add("u");
		
	}
}
