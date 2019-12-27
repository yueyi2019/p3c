package com.p3c.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {
	public static void main(String[] args) {
		createFixedThreadPool();
		
	}
	/**
	 * 固定线程池
	 */
	public static void createFixedThreadPool() {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
//		Executors.newSingleThreadExecutor();
//		Executors.newCachedThreadPool();
//		Executors.newScheduledThreadPool(10);
		for(int i=0;i<10;i++){
		    executorService.execute(new Runnable() {
				
				public void run() {
					 System.out.println(System.currentTimeMillis()+" current thread id:"+Thread.currentThread().getId());
			            try {
			                Thread.sleep(1000);
			            } catch (InterruptedException e) {
			                e.printStackTrace();
			            }
					
				}
			});
		}
		// 关闭线程池
		executorService.shutdown();
	}
}
