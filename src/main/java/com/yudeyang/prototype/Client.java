package com.yudeyang.prototype;

/**
 * Created by deyang on 2016/12/16.
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype prototype1=new ConcretePrototype();
        Prototype prototype2=prototype1.clone();
        System.out.println(prototype1);
        System.out.println(prototype2);
        System.out.println(prototype1==prototype2);
        System.out.println(prototype1.getClass()==prototype2.getClass());
    }
}
