package com.testCase.inherit;

import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void login(){
        dataMap.put("login","登陆成功");
        System.out.println("login put");
    }
}
