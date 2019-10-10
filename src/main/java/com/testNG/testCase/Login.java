package com.testNG.testCase;

public class Login {
    boolean isLogin = false;

    public String userLogin(String name, String pwd) {
        if (null == name || "".equals(name) || null == pwd || "".equals(pwd)) {
            System.out.println("用户名或者密码为空");
            isLogin = false;
            return "用户名或者密码不能为空";
        } else if (name == "admin" || name.equals("admin")) {
            System.out.println("管理员");
            isLogin = true;
            return "欢迎管理员";
        } else {
            System.out.println("正常用户");
            isLogin = true;
            return "欢迎" + name;
        }
    }
}
