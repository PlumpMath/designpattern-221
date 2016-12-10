package com.yudeyang.observer;

import java.util.Observable;

/**
 * Created by deyang on 2016/12/10.
 */
public class WeiXinObservable extends Observable {

    private int type=0;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
        if(type!=0){
            setChanged();
            notifyObservers(type);
        }
    }
}
