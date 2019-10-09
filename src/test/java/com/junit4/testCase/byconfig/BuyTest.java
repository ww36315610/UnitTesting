package com.junit4.testCase.byconfig;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;


/**
 * 通过配置来顺序测试
 */

public class BuyTest {

    static HashMap<String, Object> dataMap = new HashMap<String, Object>();

    @BeforeClass
    public static void before() {
        LoginTest lt = new LoginTest();
        dataMap = lt.login();
    }

    @Test
    public void buy() {
        //赋值
        if (dataMap.get("login").equals("登陆成功1")) {
            System.out.println("登陆成功，可以购买1");
        } else {
            System.out.println("未登录，无法购买1");
        }
    }
}
