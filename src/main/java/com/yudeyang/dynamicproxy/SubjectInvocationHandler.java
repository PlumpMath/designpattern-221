package com.yudeyang.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *Handler,中文意思是处理者，InvocationHandler的意思是调用处理器，
 * 也就是说当想调用被代理对象Ojbect时，程序会调用这个InvocationHandler,这个handler再进行内部处理。
 * Created by deyang on 2016/12/5.
 */
public class SubjectInvocationHandler implements InvocationHandler {

    /**
     * 被代理的对象
     */
    private Object object;

    public SubjectInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("begin to execute");

        Object result = method.invoke(object,args);

        System.out.println("finish executing");

        return result;
    }
}
