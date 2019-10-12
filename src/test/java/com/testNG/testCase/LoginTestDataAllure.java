package com.testNG.testCase;

import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestDataAllure {

    @DisplayName("Allure_test_demo_1")//case显示名称
    @Description("这是第一个测试")//case说明
    @Link("https://www.baidu.com")//case链接
    @Issue("001") //case编号
    @Severity(SeverityLevel.MINOR) //优先级[没看出什么用途]
    @Test(dataProvider = "putUsers", dataProviderClass = LoginTestDataAllure.class)
    public void testUserLoginData(String name,String pwd,String expect) {

        Login login = new Login();
        String ac = login.userLogin(name, pwd);
        Assert.assertEquals(expect, ac);
    }


    @DataProvider(name = "putUsers")
    public Object[][] putUsers() {
        return new Object[][]{
                {"", "", "用户名或者密码不能为空"},
                {"admin", "", "用户名或者密码不能为空"},
                {"zhangsan", "", "用户名或者密码不能为空"},
                {"", "pwd", "用户名或者密码不能为空"},
                {"admin", "123456", "欢迎管理员"},
                {"zhangsan", "123456", "欢迎zhangsan"}
        };
    }

}
