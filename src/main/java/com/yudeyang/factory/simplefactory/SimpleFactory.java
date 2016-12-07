package com.yudeyang.factory.simplefactory;

/**
 * Created by deyang on 2016/12/5.
 */
public class SimpleFactory {
    public Food produce(String name){
        if(name==null){
            return null;
        }
        if(name.equals("tomato")){
            return new TomatoEgg();
        }else if(name.equals("redmeat")){
            return new RedMeat();
        }else{
            return null;
        }
    }
}
