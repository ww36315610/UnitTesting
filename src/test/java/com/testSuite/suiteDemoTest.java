package com.testSuite;

import com.testCase.BuyTest;
import com.testCase.LoginTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoginTest.class,
        BuyTest.class
})

public class suiteDemoTest {
}
