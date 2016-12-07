package com.yudeyang.builder;

/**
 * Created by deyang on 2016/12/6.
 */
public class Director {


    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }


    public Product buildProduct(){
        builder.buildHead();
        builder.buildBody();
        return builder.buildProduct();
    }

}
