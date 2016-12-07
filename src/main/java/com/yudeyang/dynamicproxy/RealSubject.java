package com.yudeyang.dynamicproxy;

/**
 * Created by deyang on 2016/12/5.
 */
public class RealSubject implements Subject {

    public void doSomething() {

        System.out.println("doSomething!");

    }
}
