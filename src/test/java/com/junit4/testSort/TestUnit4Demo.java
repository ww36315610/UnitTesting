package com.junit4.testSort;


import org.junit.*;
import org.junit.runners.MethodSorters;


/**
 * 父类unit
 */

//排序注解
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestUnit4Demo {

    @BeforeClass
    public static void beforeAllTestCase() {
        System.out.println("@BeforeClass All TestCase");
    }

    @AfterClass
    public static void afterAllTestCase() {
        System.out.println("@AfterClass All TestCase");
    }

    @Before
    public  void beforeTest() {
        System.out.println("I am @Before Test");
    }

    @After
    public  void afterTest() {
        System.out.println("I am @After Test");
    }

    @Test
    public void testDemo1() {
        System.out.println("This is demo1");
        Assert.assertTrue(true);
    }

//    @Test
//    public void testDemo2() {
//        System.out.println("This is demo2");
//        Assert.assertTrue(true);
//    }

//    @Test
//    public void testDemo3() {
//        System.out.println("This is demo3");
//        Assert.assertTrue(false);
//    }


    @Test
    public void testDemo4() {
        System.out.println("This is demo4");
        Assert.assertTrue(true);
    }
}
