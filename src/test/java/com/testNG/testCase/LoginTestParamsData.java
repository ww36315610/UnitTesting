package com.testNG.testCase;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * 2。dataProvider实现数据管理驱动
 */
public class LoginTestParamsData {

    @Test(parameters = {"name", "pwd", "expect"})
    public void testUserLoginParam(String name, String pwd, String expect) {
        Login login = new Login();
        String ac = login.userLogin(name, pwd);
        Assert.assertEquals(expect, ac);
    }


    @Test(dataProvider = "putUsers", dataProviderClass = LoginTestParamsData.class)
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
