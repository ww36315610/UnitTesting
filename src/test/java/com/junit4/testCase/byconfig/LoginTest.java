package com.junit4.testCase.byconfig;

import java.util.HashMap;

public class LoginTest {

    public HashMap<String, Object> login() {
        HashMap<String, Object> dataMap = new HashMap<String, Object>();
        dataMap.put("LoginTest", "登陆成功1");
        System.out.println("LoginTest put1");
        return dataMap;
    }


}
