package com.junit4.testCase.inherit;

import org.junit.Test;

public class BuyTest extends BaseTest {

    @Test
    public void buy(){
        if(dataMap.get("LoginTest").equals("登陆成功")){
            System.out.println("登陆成功，可以购买");
        }else{
            System.out.println("未登录，无法购买");
        }
    }
}
