package com.yudeyang.builder;

import com.yudeyang.proxy.ProxySubject;

/**
 * Created by deyang on 2016/12/6.
 */
public class ConcreteBuilder implements Builder {

    private Product product=new Product();

    public void buildHead(){
        product.setHead("HEAD");
    }

    public void buildBody(){
        product.setBody("BODY");
    }

    public Product buildProduct(){
        return product;
    }

}
