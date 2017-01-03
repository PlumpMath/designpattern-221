package com.yudeyang.vistor;

/**
 * 小说类接口，如果不使用iteration 则不用实现这个接口，只需要有accept(NovelReader reader)这个方法即可，
 * 相应的NovleReader接口也需要做相应调整
 * Created by deyang on 2017/1/3.
 */
public interface Novel {
    public void accept(NovelReader reader );
}
