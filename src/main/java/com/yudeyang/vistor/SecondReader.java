package com.yudeyang.vistor;

/**
 * Created by deyang on 2017/1/3.
 */
public class SecondReader implements NovelReader {
    @Override
    public void read(Hamlet hamlet) {
        System.out.println(this.getClass().getSimpleName()+" think "+hamlet.getName() +" is BAD!");
    }

    @Override
    public void read(RedAndBlack redAndBlack) {
        System.out.println(this.getClass().getSimpleName()+" think "+redAndBlack.getName() +" is BAD!");
    }
}
