package com.junit5.testCase;


import org.junit.jupiter.api.*;

@DisplayName("Junit5 演示类")
public class Junit5Demo1 {

    @BeforeAll
    public static void beforALl() {
        System.out.println("This is junit5 beforeClss");
    }

    @BeforeEach
    public void beforeMethod() {
        System.out.println("Befor junit5 method");
    }

    @AfterEach
    public void afterMethod() {
        System.out.println("After junit5 method");
    }

    @AfterAll
    public static void afterALl() {
        System.out.println("This is junit5 afterClass");
    }
    @Test
    @DisplayName("fun1方法")
    public void fun1() {
        System.out.println("junit5---test---11111");
    }

    @Test
    @RepeatedTest(3)
    public void fun2() {
        System.out.println("junit5---test---222222");
    }


    @Test
    @Disabled
    public void fun3() {
        System.out.println("junit5---test---333333");
    }
}
