package com.p3c.thread;
/**
 * dcl双重校验锁
 * 	这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * @author yueyi2019
 *
 */
public class SingletonTest {
	private volatile static SingletonTest singleton;

	private SingletonTest() {
	}

	public static SingletonTest getSingleton() {
		if (singleton == null) {
			synchronized (SingletonTest.class) {
				if (singleton == null) {
					singleton = new SingletonTest();
				}
			}
		}
		return singleton;
	}
}