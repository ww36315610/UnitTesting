package com.testSort;


import org.junit.*;
import org.junit.runners.MethodSorters;

/**
 * 子类1_unit
 */

//排序注解
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestUnit4ChildrenDemo1 extends TestUnit4Demo {

    @BeforeClass
    public static void beforeClildrenAllTestCase() {
        System.out.println("Children--@BeforeClass All TestCase");
    }

    @AfterClass
    public static void afterClildrenAllTestCase() {
        System.out.println("Children--@AfterClass All TestCase");
    }

    @Before
    public void beforeClildrenTest() {
        System.out.println("Children--I am @Before Test");
    }

    @After
    public void afterClildrenTest() {
        System.out.println("Children--I am @After Test");
    }

    @Test
    public void testDemo1() {
        System.out.println("Children--This is demo1");
        Assert.assertTrue(true);
    }

//    @Test
//    public void testDemo2() {
//        System.out.println("Children--This is demo2");
//        Assert.assertTrue(true);
//    }

//    @Test
//    public void testDemo3() {
//        System.out.println("Children--This is demo3");
//        Assert.assertTrue(false);
//    }


    @Test
    public void testDemo5() {
        System.out.println("Children--This is demo5");
        Assert.assertTrue(true);
    }
}
