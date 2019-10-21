package com.testNG.test;


import org.testng.annotations.*;

public class GroupTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite__________Suite");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass___________Class");
    }

    @BeforeGroups("server")
    public void beforeGroups() {
        System.out.println("beforeGroup__________Group");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod_________Method");
    }

    @Test(groups = "server")
    public void testGroup_1() {
        System.out.println("This is group_test_1");
    }

    @Test(groups = "client")
    public void testGroup_2() {
        System.out.println("This is group_test_2");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod_________Method");
    }

    @AfterGroups("server")
    public void afterGroups() {
        System.out.println("afterGroup__________Group");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass___________Class");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite__________Suite");
    }


}
