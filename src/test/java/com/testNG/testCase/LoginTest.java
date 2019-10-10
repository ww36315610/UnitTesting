package com.testNG.testCase;

import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest {

    @Test
    public void testUserLogin0() {
        Login login = new Login();
        String ac = login.userLogin("", "");
        Assert.assertEquals("用户名或者密码不能为空", ac, "空 is fail");
    }


    @Test
    public void testUserLogin1() {
        Login login = new Login();
        String ac = login.userLogin("admin", "");
        Assert.assertEquals("用户名或者密码不能为空", ac, "admin空 is fail");
    }

    @Test
    public void testUserLogin2() {
        Login login = new Login();
        String ac = login.userLogin("zhangsan", "");
        Assert.assertEquals("用户名或者密码不能为空", ac, "zhangsan空 is fail");
    }

    @Test
    public void testUserLogin3() {
        Login login = new Login();
        String ac = login.userLogin("", "pwd");
        Assert.assertEquals("用户名或者密码不能为空", ac, "pwd is fail");
    }

    @Test
    public void testUserLogin4() {
        Login login = new Login();
        String ac = login.userLogin("admin", "adminpwd");
        Assert.assertEquals("欢迎管理员", ac, "admin pwd is fail");
    }

    @Test
    public void testUserLogin5() {
        Login login = new Login();
        String ac = login.userLogin("zhangsan", "zhangsan");
        Assert.assertEquals("欢迎zhangsan", ac, "zhangsan pwd is fail");
    }
}
