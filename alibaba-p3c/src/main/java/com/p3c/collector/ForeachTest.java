package com.p3c.collector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForeachTest {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
//		list.remove("4");
//		System.out.println(list);
		
		// 换成2 3 4 ，除了3正常，其他异常
//		for (String string : list) {
//			if(string.equals("14")) {
//				list.remove(string);
//			}
//		}
//		System.out.println(list);
		
		// 正确
//		Iterator<String> iterator = list.iterator();
//		while (iterator.hasNext()) {
//			String str = iterator.next();
//			if("1".equals(str)) {
//				iterator.remove();
//			}
//			
//		}
//		System.out.println(list);
		
		// 正常
		for (int i = 0; i < list.size(); i++) {
			String string = list.get(i);
			if(string.equals("1")) {
				list.remove(string);
			}
		}
		System.out.println(list);
		
//		System.out.println(list.toString());
//		GenericsTest.getAnimal();
	}
}
