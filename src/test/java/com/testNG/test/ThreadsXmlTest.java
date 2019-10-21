package com.testNG.test;

import org.testng.annotations.Test;

public class ThreadsXmlTest {


    @Test()
    public void threadTest3() {
        System.out.printf("Thread 333 Id:%s%n", Thread.currentThread().getId());
    }

    @Test()
    public void threadTest4() {
        System.out.printf("Thread 444 Id:%s%n", Thread.currentThread().getId());
    }
}
