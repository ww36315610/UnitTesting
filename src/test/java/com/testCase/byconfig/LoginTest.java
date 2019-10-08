package com.testCase.byconfig;

import java.util.HashMap;

public class LoginTest {

    public HashMap<String, Object> login() {
        HashMap<String, Object> dataMap = new HashMap<String, Object>();
        dataMap.put("login", "登陆成功");
        System.out.println("login put");
        return dataMap;
    }


}
