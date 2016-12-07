package com.yudeyang.factory.abstractfactory;

/**
 * Created by deyang on 2016/12/5.
 */
public class Client {

    public static void main(String[] args) {

        AbstractFactory tomatoEggFactory=new TomatoEggFactory();
        tomatoEggFactory.produce().cook();

        AbstractFactory redMeatFactory=new RedMeatFactory();
        redMeatFactory.produce().cook();

    }
}
