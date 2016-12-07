package com.yudeyang.proxy;

/**
 * Created by deyang on 2016/12/5.
 */
public class Client {

    public static void main(String[] args) {

        Subject subject=new RealSubject();

        ProxySubject proxySubject=new ProxySubject(subject);

        proxySubject.doSomething();

    }

}
