package com.junit5.suite;

import com.junit5.testCase.Junit5Nested;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
//@SelectPackages({
//        "com.junit5"
//})
//@IncludePackages({
//        "com.junit5.testCase"
//})
@SelectClasses({Junit5Nested.class})
public class Junit5SuiteDemo1 {
}
