package com.testNG.test;


import org.testng.annotations.Test;

/**
 * 依赖测试
 */
public class DependsOnMethodsTest {


    /**
     * 正向测试
     */
    @Test
    public  void method_1(){
        System.out.println("111111111");
    }


    @Test(dependsOnMethods = "method_1")
    public  void method_2(){
        System.out.println("222222222");
    }


    /**
     * 反向测试
     */

    @Test
    public  void method_3(){
        System.out.println("333333333");
        throw new RuntimeException();
    }


    @Test(dependsOnMethods = "method_3")
    public  void method_4(){
        System.out.println("444444444");
    }

}
