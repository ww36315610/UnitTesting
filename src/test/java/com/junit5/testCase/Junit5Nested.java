package com.junit5.testCase;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * 通过@Nested注解，内部类来实现：购买支付流程
 */
public class Junit5Nested {
    public static HashMap<String, Object> dataMap = new HashMap<String, Object>();

    @Test
    void loginTest() {
        dataMap.put("login", "登录成功");
    }

    /**
     * 支付类
     */
    @Nested
    class payTest{
        @Test
        void payTest(){
            if(null != dataMap.get("buy")){
                System.out.println("正在支付，请等待……");
                System.out.println(dataMap.get("buy"));
            }else{
                System.out.println("你还没有购买商品，请先购买再支付😊");
            }
        }
    }

    /**
     * 购买类
     */
    @Nested
    class BuyTest {
        @Test
        void buyTest() {

            if (dataMap.get("login").equals("登录成功")) {
                System.out.println("登录成功啦，可以购买商品了");
                dataMap.put("buy", "购买了addiss椰子");
            } else {
                System.out.println("请重新登录");
            }
        }
    }
}
