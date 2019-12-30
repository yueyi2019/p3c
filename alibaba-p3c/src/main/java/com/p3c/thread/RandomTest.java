package com.p3c.thread;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomTest {
	public static void main(String[] args) {
//		Random random1 = new Random(1);
//		Random random2 = new Random(1);
//		Random random3 = new Random(1);
//		Random random4 = new Random(1);
//		
//		Random random5 = new Random(2);
//		
//		System.out.println(random1.nextInt(100));
//		System.out.println(random2.nextInt(100));
//		System.out.println(random3.nextInt(100));
//		System.out.println(random4.nextInt(100));
//		System.out.println(random5.nextInt(100));
//		
//		System.out.println(Math.random());
		// 有人这么写，不对
//		System.out.println((int)(Math.random() * 1000));
		for (int i = 0; i < 10; i++) {
			System.out.println(new Random().nextInt(1000));
		}
//		System.out.println("=====");
		// 用这个没有线程问题
//		System.out.println(ThreadLocalRandom.current().nextInt(100));;
	}
}
