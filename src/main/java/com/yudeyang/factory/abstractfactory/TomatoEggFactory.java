package com.yudeyang.factory.abstractfactory;

/**
 * Created by deyang on 2016/12/5.
 */
public class TomatoEggFactory implements AbstractFactory {
    @Override
    public Food produce() {
        return new TomatoEgg();
    }
}
