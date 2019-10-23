package com.testNG.test;

import org.testng.annotations.Test;

/**
 * 多线程测试
 */
public class ThreadsTest {

    //
    @Test(invocationCount = 5,threadPoolSize = 2)
    public void threadTest1() {
        System.out.printf("Thread 111 Id:%s%n", Thread.currentThread().getId());
    }

    @Test(invocationCount = 5,threadPoolSize = 2)
    public void threadTest2() {
        System.out.printf("Thread 222 Id:%s%n", Thread.currentThread().getId());
    }
}
