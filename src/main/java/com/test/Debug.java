package com.test;

public class Debug {
    public void test1(String name){
        name = "ttt111";
        System.out.println(name);
    }

    public String test2(){
        return "tt222";
    }

    public static void main(String[] args) {
        Debug dd = new Debug();
        dd.test1(dd.test2());
    }
}
