package com.yudeyang.factory.abstractfactory;

/**
 * Created by deyang on 2016/12/5.
 */
public class TomatoEgg implements Food {
    @Override
    public void cook() {
        System.out.println("蕃茄炒鸡蛋");
    }
}
