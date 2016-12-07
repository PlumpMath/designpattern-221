package com.yudeyang.proxy;

/**
 *
 * Created by deyang on 2016/12/5.
 */
public class ProxySubject implements Subject{


    private Subject subject;


    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    public void doSomething() {
        System.out.println("=======Before==========");
        subject.doSomething();
        System.out.println("=======After==========");
    }
}
