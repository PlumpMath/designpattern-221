package com.yudeyang.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by deyang on 2016/12/10.
 */
public class Client {


    /**
     * JDK提供了默认的Observer模式，具体请查看java.util.Observable
     * 和java.util.Observer接口，具体实现请参考本包内的内容
     * java.Observer
     *
     *
     * 有人问我Observer和Publish/Subscribe的区别，我认为其实他们是一样的。只是在不同的领域叫法不一样。
     * 比如四人帮设计模式中一般叫做Observer
     * 而在软件架构中被称为Publish/Subscribe(Pub/Sub)
     * 请参考https://en.wikipedia.org/wiki/Software_design_pattern最下面的表格中的分类信息
     * @param args
     */
    public static void main(String[] args) {

        WeiXinObservable observable=new WeiXinObservable();
        Observer observer1=new HongBaoObserver();
        Observer observer2=new ZhuanZhangObserver();
        Observer observer3=new ZhuanZhangObserver();
        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);
        observable.setType(2);
    }
}
