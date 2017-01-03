package com.yudeyang.vistor;

/**
 * Created by deyang on 2017/1/3.
 * 读书评价
 */
public class ReaderComment {

    public static void main(String[] args) {
        Novel hamlet=new Hamlet();
        Novel redAndBlack=new RedAndBlack();

        NovelReader firstReader=new FirstReader();
        NovelReader secondReader=new SecondReader();

        hamlet.accept(firstReader);
        hamlet.accept(secondReader);

        redAndBlack.accept(firstReader);
        redAndBlack.accept(secondReader);
    }
}
