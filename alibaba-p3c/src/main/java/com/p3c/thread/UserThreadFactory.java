package com.p3c.thread;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class UserThreadFactory implements ThreadFactory {
	private final String namePrefix;
	private final AtomicInteger nextId = new AtomicInteger(1);

	// 定义线程池名字
	UserThreadFactory(String whatFeaturOfGroup) {
		namePrefix = "From UserThreadFactory's " + whatFeaturOfGroup + "-Worker-";
	}

	@Override
	public Thread newThread(Runnable task) {
		String name = namePrefix + nextId.getAndIncrement();
		Thread thread = new Thread(task);
		System.out.println(thread.getName());
		return thread;
	}
}