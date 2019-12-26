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
		//第一步 正确移除
//		list.remove("4");
//		System.out.println(list);
		
		// 异常 第二步 把3依次换成 1，2，4
		for (String string : list) {
			if(string.equals("1")) {
				list.remove(string);
			}
		}
		System.out.println(list);
		
		// 正确操作，依次换数字
//		Iterator<String> iterator = list.iterator();
//		while (iterator.hasNext()) {
//			String str = iterator.next();
//			if("4".equals(str)) {
//				iterator.remove();
//			}
//			
//		}
//		System.out.println(list);
		
		// 正确操作依次换数字
//		for (int i = 0; i < list.size(); i++) {
//			String string = list.get(i);
//			if(string.equals("4")) {
//				list.remove(string);
//			}
//		}
//		System.out.println(list);
		
//		System.out.println(list.toString());
//		GenericsTest.getAnimal();
	}
}
