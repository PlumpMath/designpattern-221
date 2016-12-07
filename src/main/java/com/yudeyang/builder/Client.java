package com.yudeyang.builder;

/**
 * Created by deyang on 2016/12/6.
 */
public class Client {

    public static void main(String[] args) {
        Builder builder=new ConcreteBuilder();
        Director director=new Director(builder);
        Product product=director.buildProduct();
        System.out.println(product);
    }
}
