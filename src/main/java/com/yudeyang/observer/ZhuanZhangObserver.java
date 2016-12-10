package com.yudeyang.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by deyang on 2016/12/10.
 */
public class ZhuanZhangObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if(((Integer)arg).intValue()==2){
            System.out.println("谁给我转账了！");
        }
    }
}
