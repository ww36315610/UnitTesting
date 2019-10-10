package com.junit4.testCase.inherit;

import org.junit.Test;

public class LoginTestTest extends BaseTest {

    @Test
    public void login(){
        dataMap.put("LoginTest","登陆成功");
        System.out.println("LoginTest put");
    }
}
