package com.yudeyang.vistor;

/**
 * Created by deyang on 2017/1/3.
 */
public class FirstReader implements NovelReader {
    @Override
    public void read(Hamlet hamlet) {
        System.out.println(this.getClass().getSimpleName()+" think "+hamlet.getName() +" is Good!");
    }

    @Override
    public void read(RedAndBlack redAndBlack) {
        System.out.println(this.getClass().getSimpleName()+" think "+redAndBlack.getName() +" is Good!");
    }
}
