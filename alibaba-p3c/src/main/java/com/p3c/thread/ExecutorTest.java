package com.p3c.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {
	public static void main(String[] args) {
		createFixedThreadPool();
		
	}
	/**
	 * 创建固定大小的线程池
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
		// 此时并不会立即终止所有任务，而是等待所有任务完成后，再关闭线程池。
		executorService.shutdown();
	}
}
