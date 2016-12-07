package com.yudeyang.singleton;

/**
 * Created by deyang on 2016/12/6.
 */
public class Client {

    public static void main(String[] args) {
        Singleton singleton1=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance2();
        Singleton singleton3=Singleton.getInstance3();
        System.out.println(singleton1==singleton2);
        System.out.println(singleton1==singleton3);
    }
}
