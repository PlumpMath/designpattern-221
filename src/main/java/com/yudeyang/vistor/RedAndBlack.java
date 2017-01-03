package com.yudeyang.vistor;

/**
 * Created by deyang on 2017/1/3.
 * 红与黑
 */
public class RedAndBlack implements Novel {

    private String name="redAndBlack";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void accept(NovelReader reader) {
        reader.read(this);
    }
}
