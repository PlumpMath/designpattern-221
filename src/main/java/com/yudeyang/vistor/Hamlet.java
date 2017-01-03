package com.yudeyang.vistor;

/**
 * Created by deyang on 2017/1/3.
 * 哈姆雷特
 */
public class Hamlet implements Novel{

    private String name="hamlet";

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
