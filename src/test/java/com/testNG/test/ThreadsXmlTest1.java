package com.testNG.test;

import org.testng.annotations.Test;

public class ThreadsXmlTest1 {


    @Test()
    public void threadTest5() {
        System.out.printf("Thread 555 Id:%s%n", Thread.currentThread().getId());
    }

    @Test()
    public void threadTest6() {
        System.out.printf("Thread 666 Id:%s%n", Thread.currentThread().getId());
    }
}
