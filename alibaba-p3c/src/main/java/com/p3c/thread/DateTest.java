package com.p3c.thread;

import java.time.Instant;
import java.util.Date;

public class DateTest {
	
	public static void main(String[] args) {
		new Date().getTime();
		
		Instant now = Instant.now();
		// 秒
		System.out.println(now.getEpochSecond());
		// 毫秒
		now.toEpochMilli();
		
	}
}
