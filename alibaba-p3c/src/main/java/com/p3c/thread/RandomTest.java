package com.p3c.thread;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomTest {
	public static void main(String[] args) {
		Random random1 = new Random(1);
		Random random2 = new Random(1);
		Random random3 = new Random(1);
		Random random4 = new Random(1);
		
		Random random5 = new Random(2);
		
		System.out.println(random1.nextInt(100));
		System.out.println(random2.nextInt(100));
		System.out.println(random3.nextInt(100));
		System.out.println(random4.nextInt(100));
		System.out.println(random5.nextInt(100));
		
		System.out.println(Math.random());
		// 有的人取整数这么干，不要下面这么干
//		System.out.println((int)(Math.random() * 1000));
		for (int i = 0; i < 10; i++) {
			System.out.println(new Random().nextInt(10000));
		}
		System.out.println("=====");
		// TheadLocalRandom使用方法
		System.out.println(ThreadLocalRandom.current().nextInt(100));;
	}
}
