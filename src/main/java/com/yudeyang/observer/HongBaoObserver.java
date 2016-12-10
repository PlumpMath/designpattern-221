package com.yudeyang.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by deyang on 2016/12/10.
 */
public class HongBaoObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if(((Integer)arg).intValue()==1){
            System.out.println("红包来了！");
        }
    }
}
