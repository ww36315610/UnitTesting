package com.testNG.testCase;

import com.allure.SetStep;
import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class LoginTestDataAllure {

    @DisplayName("Allure_DataProvider_test_demo")//case显示名称
    @Description("DataProvider+allure测试")//case说明
    @Link("https://www.baidu.com")//case链接
    @Issue("002") //case编号
    @Severity(SeverityLevel.MINOR) //优先级[没看出什么用途]
    @Test(dataProvider = "putUsers", dataProviderClass = LoginTestDataAllure.class)
    public void testUserLoginData(String name, String pwd, String expect) {
        Login login = new Login();
        String ac = login.userLogin(name, pwd);
        boolean con = expect.equals(ac);

        //如果预期不符合，可以动态添加step
        if (!con) {
            SetStep ss = new SetStep();
            if (expect.equals("用户名或者密码不能为空1")) {
                ss.stepAdd("otherERROR", "loginByOther", "");
            } else if (expect.equals("欢迎管理员1")) {
                ss.stepAdd("loginByAdmin", "loginByAdmin", "");
            } else if (expect.equals("欢迎zhangsan1")) {
                ss.stepAdd("loginByZhangSan", "loginByZhangSan", "");
            }
        }

        Assert.assertTrue(con);
    }


    @DataProvider(name = "putUsers")
    public Object[][] putUsers() {
        return new Object[][]{
                {"", "", "用户名或者密码不能为空"},
                {"admin", "", "用户名或者密码不能为空"},
                {"zhangsan", "", "用户名或者密码不能为空"},
                {"", "pwd", "用户名或者密码不能为空1"},
                {"admin", "123456", "欢迎管理员1"},
                {"zhangsan", "123456", "欢迎zhangsan1"}
        };
    }

    //根据方法名传递参数
    @Test(dataProvider = "methodData")
    public void test1(String name, String pwd) {
        System.out.println("name:" + name + "pwd:" + pwd);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name, String pwd) {
        System.out.println("name:" + name + "pwd:" + pwd);
    }

    @DataProvider(name= "methodData")
    public Object[][] methodData(Method method){
        Object[][] objects =null;
        if(method.getName().equals("test1")){
            objects = new Object[][]{
                    {"wang111","111111"},
                    {"xiang11","11111"}
            };
        }else if(method.getName().equals("test2")){
            objects = new Object[][]{
                    {"li2222","222222"},
                    {"wang222","222222"}
            };
        }
        return  objects;
    }


}
