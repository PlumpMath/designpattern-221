package com.yudeyang.factory.simplefactory;

/**
 * Created by deyang on 2016/12/5.
 */
public class Client {
    public static void main(String[] args) {
        SimpleFactory factory=new SimpleFactory();
        Food tomato=factory.produce("tomato");
        tomato.cook();
        Food redmeat=factory.produce("redmeat");
        redmeat.cook();
        Food nullfood=factory.produce("nullfood");
        nullfood.cook();//Exception
    }
}
