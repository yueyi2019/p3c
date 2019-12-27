package com.p3c.collector;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		Long iSize = 2L;
		for (int i = 0; i < iSize; i++) {
			list.add("list");
		}
		
		String[] a = list.toArray(new String[0]);
//		System.out.println(list.toString());
//		a[0] = "dd";
//		System.out.println(list.toString());
		
		System.out.println(Arrays.toString(a));
		list.set(0, "dd");
		System.out.println(Arrays.toString(a));

//		start = Instant.now().getEpochSecond();
		
		// 看源码用
//		Collections.addAll(c, elements)
		
	}

}
