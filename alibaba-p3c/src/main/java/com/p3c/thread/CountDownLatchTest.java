package com.p3c.thread;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

    private static final int THREAD_COUNT_NUM = 7;
    private static CountDownLatch countDownLatch = new CountDownLatch(THREAD_COUNT_NUM);

    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <= THREAD_COUNT_NUM; i++) {
            int index = i;
            new Thread(() -> {
                try {
                    System.out.println("第" + index + "几个龙珠");
                    // 模仿等待
                    Thread.sleep(new Random().nextInt(3000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 用countDown是必须的。
                countDownLatch.countDown();
            }).start();
        }
        // 凑齐了龙珠
        countDownLatch.await();
        System.out.println("可以召唤神龙");
    }
}
