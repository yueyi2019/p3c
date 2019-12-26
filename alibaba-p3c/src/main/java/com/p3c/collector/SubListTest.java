package com.p3c.collector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubListTest {
	
	public static void main(String[] args) {
		subList1();
//		subList2();
	}
	
	public static void subList1() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list.toString());
		List a = list.subList(0, 1);
		// 此时添加d，源集合也响应的更改。
		a.add("d");
		list.add("e");
		System.out.println(list.toString());
		System.out.println(a.toString());
	}
	public static void subList2() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		List a = list.subList(1, 3);
		/* 删掉其中元素，再访问a 会报错，因为源删除，导致list a 中少元素了。
		 * list执行 remove 后 ，debug看a，里面有异常了。
		 */
		list.remove("b");
		System.out.println(list.toString());
		
//		System.out.println(a.get(0));
//		System.out.println(a.get(1));
		
	}
}
