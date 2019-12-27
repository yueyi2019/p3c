package com.p3c.collector;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();
		map.put("1", "a");
		map.put("2", "b");
		map.put("3", "c");
		
		Set<String> s = map.keySet();
		
//		s.add("4");
		map.put("5", "d");
		System.out.println(map);
	}
}
