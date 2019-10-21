package com.testNG.testCase;

import com.allure.SetStep;
import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest {

    @DisplayName("Allure_test_demo")//case显示名称
    @Description("test+allure测试")//case说明
    @Link("https://www.baidu.com")//case链接
    @Issue("001") //case编号
    @Severity(SeverityLevel.MINOR) //优先级[没看出什么用途]
    @Test
    public void testUserLogin0() {
        Login login = new Login();
        String ac = login.userLogin("", "");
        boolean con =  ac.equals("人为创造false");
        if(!con){
            SetStep setStep = new SetStep();
            setStep.loginByOther("入参");
        }
        Assert.assertTrue(con, "空 is fail");
    }

//    @Test(enabled = false)
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
