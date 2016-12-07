package com.yudeyang.builder;

/**
 * Created by deyang on 2016/12/6.
 */
public class Product {

    private String head;

    private String body;


    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Product{" +
                "head='" + head + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
