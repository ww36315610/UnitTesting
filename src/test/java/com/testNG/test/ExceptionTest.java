package com.testNG.test;

import org.testng.annotations.Test;

public class ExceptionTest {

    @Test(expectedExceptions = RuntimeException.class)
    public void testException1() {
        System.out.println("这是一个正确的异常测试");
        throw new RuntimeException();
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void testException2() {
        System.out.println("这是一个错误的异常测试");
    }


    public void method(String name) {
         if(name.equals("zhangsan")){
             System.out.println("zhangsan");
         }else {
             System.out.println("other");
         }
    }

    @Test(expectedExceptions = Exception.class)
    public void testExceptionMethod() {
            method("name is zhangsan");
    }


    @Test(expectedExceptions = Exception.class)
    public void testExceptionMethod1() {
        System.out.println("name is null");
        method(null);
    }
}