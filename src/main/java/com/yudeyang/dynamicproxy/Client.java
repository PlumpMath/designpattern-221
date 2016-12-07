package com.yudeyang.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理客户端
 * Created by deyang on 2016/12/5.
 */
public class Client {

    public static void main(String[] args) {

        Subject subject=new RealSubject();

        SubjectInvocationHandler subjectInvocationHandler=new SubjectInvocationHandler(subject);

        //获取真实主题类的ClassLoader
        ClassLoader classLoader = subject.getClass().getClassLoader();
        //动态产生一个代理者。
        Class<?>[] cls = new Class[]{Subject.class};

        Subject proxySubject= (Subject) Proxy.newProxyInstance(classLoader,cls,subjectInvocationHandler);

        proxySubject.doSomething();

    }

}
