package com.allure;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import io.qameta.allure.model.Status;
import io.qameta.allure.model.StepResult;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SetStep {

    /**
     * 动态添加步骤【step】
     *
     * @param stepName:步骤名称
     * @param methodName：动态执行方法名
     * @param methodParams：动态执行方法-入参
     */
    public void stepAdd(String stepName, String methodName, String methodParams) {
        StepResult stepResult = new StepResult();
        stepResult.setStatus(Status.FAILED);
        stepResult.setName(stepName);
        Allure.getLifecycle().startStep(stepName, stepResult);

        //动态步骤-添加内容
        try {
            String getMethodParam = (String) reflectionMethod(methodName, methodParams);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        Allure.getLifecycle().stopStep();
    }

    //[静态增加步骤]其他用户登录
    @Step("loginByother")
    public String loginByOther(String param) {
        //上传一张照片，这个可以用来做UI自动化报错是截图，然后传到报告中去
        pushPicture();
        param = "这是其他的用户在登录测试……";
        return param;
    }

    //[静态增加步骤]admin登录
    @Step("loginByAdmin")
    public String loginByAdmin(String param) {
        //上传一张照片，这个可以用来做UI自动化报错是截图，然后传到报告中去
        pushPicture();
        param = "这是admin在登录测试……";
        System.out.println(param);
        return param;
    }

    //[静态增加步骤]zhangsan登录
    @Step("loginByZhangSan")
    public String loginByZhangSan(String param) {
        //上传一张照片，这个可以用来做UI自动化报错是截图，然后传到报告中去
        pushPicture();
        param = "这是zhangsan在登录测试……";
        return param;
    }


    public void pushPicture() {
        try {
            Allure.addAttachment("picture", "image/png", new FileInputStream("/Users/apple/Desktop/photo/allure/allure_1.png"), ".png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 通过反射动态获取执行方法
    public Object reflectionMethod(String methodName, String param) throws NoSuchMethodException, SecurityException,
            IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = getClass().getMethod(methodName, String.class);
        return method.invoke(this, param);
    }
}
