package com.testParams;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class DemoTests {

    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();

    @Test
    public void demo1(){
//        errorCollector.checkThat(1,equalTo(2));
//    errorCollector.checkThat(1,equals(2));
    }
}
