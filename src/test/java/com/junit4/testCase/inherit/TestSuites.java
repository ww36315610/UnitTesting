package com.junit4.testCase.inherit;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 利用父类继承来组织过程
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoginTest.class,
        BuyTest.class
})

public class TestSuites {
}
