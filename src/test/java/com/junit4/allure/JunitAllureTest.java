package com.junit4.allure;

import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import io.qameta.allure.model.Status;
import io.qameta.allure.model.StepResult;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JunitAllureTest {


    @Test
    @DisplayName("Allure_test_demo_1")//case显示名称
    @Description("这是第一个测试")//case说明
    @Link("https://www.baidu.com")//case链接
    @Issue("001") //case编号
    @Severity(SeverityLevel.MINOR) //优先级[没看出什么用途]
    public void demo1() {
        boolean con = login("zhangsan", "123456");
        if (!con) {
            //比如失败了，需要增加一个步骤
            stepAdd("登录失败","getPictureFail","getPictureFail");
//            getPicture();
        }
        Assert.assertTrue(con);

    }


    @Test
    @DisplayName("Allure_test_demo_2")//case显示名称
    @Description("这是第二个测试")//case说明
    @Link("https://www.baidu.com")//case链接
    @Issue("002") //case编号
    @Severity(SeverityLevel.MINOR) //优先级[没看出什么用途]
    public void demo2() {
        boolean con = login("admin", "123456");
        if (con) {
            //比如失败了，需要增加一个步骤
            stepAdd("登录成功","getPictureSuccess","getPictureSuccess");
//            getPicture();
        }
        Assert.assertTrue(con);
    }

    @Test
    @DisplayName("Allure_test_demo_3")//case显示名称
    @Description("这是第三个测试")//case说明
    @Link("https://www.baidu.com")//case链接
    @Issue("003") //case编号
    @Severity(SeverityLevel.MINOR) //优先级[没看出什么用途]
    public void demo3() {
        boolean con = login("zhangsan", "123456");
        if (!con) {
            //比如失败了，需要增加一个步骤
            stepAdd("登录错误","getPictureLog","getPictureLog");
//            getPicture();
        }
        Assert.assertTrue(con);
    }


    public boolean login(String name, String pwd) {
        boolean con = false;
        if ("admin".equals(name) && "123456".equals(pwd)) {
            System.out.println("admin_is_login");
            con = true;
        }
        return con;

    }


    //上传照片[静态增加步骤]
    @Step("push a picture-success")
    public String getPictureSuccess(String param) {
        //上传一张照片，这个可以用来做UI自动化报错是截图，然后传到报告中去
        try {
            Allure.addAttachment("picture", "image/png", new FileInputStream("/Users/apple/Desktop/photo/allure/allure_1.png"), ".png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        param = "无任何报错的截图……";
        System.out.println(param);
        return param;
    }


    //上传照片[静态增加步骤]
    @Step("push a picture-fail")
    public String getPictureFail(String param) {
        //上传一张照片，这个可以用来做UI自动化报错是截图，然后传到报告中去
        try {
            Allure.addAttachment("picture", "image/png", new FileInputStream("/Users/apple/Desktop/photo/allure/allure_1.png"), ".png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        param = "这是失败的截图……";
        System.out.println(param);
        return param;
    }

    //上传照片[静态增加步骤]
    @Step("output error-log")
    public String getPictureLog(String param) {
        //上传一张照片，这个可以用来做UI自动化报错是截图，然后传到报告中去
        param = "some error log……";
        System.out.println(param);
        return param;
    }

    //动态添加步骤
    public void stepAdd(String stepName,String methodName,String methodParams) {
        StepResult stepResult = new StepResult();
        stepResult.setStatus(Status.FAILED);
        stepResult.setName(stepName);
        Allure.getLifecycle().startStep(stepName, stepResult);
        //动态步骤-添加内容
        try {
           String getMethodParam = (String) reflectionMethod(methodName,methodParams);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        Allure.getLifecycle().stopStep();
    }

    // 通过反射动态获取执行方法
    public Object reflectionMethod(String methodName, String param) throws NoSuchMethodException, SecurityException,
            IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = getClass().getMethod(methodName, String.class);
        return method.invoke(this, param);
    }

}
