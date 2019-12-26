package com.p3c.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SimpleDateFormatTest {
	
	// 用此定义会发生线程安全问题，并抛异常
	private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	private static final ThreadLocal<SimpleDateFormat> simpleDateFormatSalfe = new ThreadLocal<SimpleDateFormat>() {
		@Override
		protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		}
	};

	public static void main(String[] args) {
		// 配合第一种线程不安全的方式调用
//		createFixedThreadPool();
		
		// 配合第二种线程安全方式
		createFixedThreadPoolSafe();
	}

	/**
	 * 创建固定大小的线程池
	 */
	public static void createFixedThreadPool() {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			executorService.execute(new Runnable() {

				public void run() {
					String dateString = simpleDateFormat.format(new Date());
					try {
						Date parseDate = simpleDateFormat.parse(dateString);
						String dateString2 = simpleDateFormat.format(parseDate);
						System.out.println(dateString.equals(dateString2));
					} catch (ParseException e) {
						e.printStackTrace();
					}

				}
			});
		}
		// 此时并不会立即终止所有任务，而是等待所有任务完成后，再关闭线程池。
		executorService.shutdown();
	}
	public static void createFixedThreadPoolSafe() {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			executorService.execute(new Runnable() {

				public void run() {
					
					try {
						String dateString = simpleDateFormatSalfe.get().format(new Date());
						Date parseDate = simpleDateFormatSalfe.get().parse(dateString);
						String dateString2 = simpleDateFormatSalfe.get().format(parseDate);
						System.out.println(dateString.equals(dateString2));
					} catch (ParseException e) {
						e.printStackTrace();
					}finally {
						simpleDateFormatSalfe.remove();
					}

				}
			});
		}
		// 此时并不会立即终止所有任务，而是等待所有任务完成后，再关闭线程池。
		executorService.shutdown();
	}
}