package com.p3c.oop;

import java.math.BigDecimal;
import java.util.Objects;

public class EquealTest {
	public static void main(String[] args) {
		
		// jdk7 后
//		boolean b = Objects.equals("a", new String("ab"));
//		System.out.println(b);
		
		// 下面一起
//		Integer intA = 3,intB = 3;
//		System.out.println(intA == intB);
//		Integer intC = 200,intD = 200;
//		System.out.println(intC == intD);
//		System.out.println(intA.equals(intB));
//		System.out.println(intC.equals(intD));
		
//		System.out.println(4.0f-2.0f);
		
		// 看源码用
		BigDecimal b = new BigDecimal(1.0);
		
		float f1 = 0.55f;
		float f2 = 0.5f;
		float f3 = 0.45f;
		
		float f4 = f1-f2;
		float f5 = f2-f3;
		
		System.out.println(f4==0.05f);
		System.out.println(f5==0.05f);
		
	}
}