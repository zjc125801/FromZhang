package com.zjc.demoapp;

/**
 * Created by taren on 2017/12/18.
 */

public class Msg {
    public static final int TYPE_RECEIVEN = 0 ;
    public static final int TYPE_SEND = 1;
    private String content;
    private int type;

    public Msg(String content, int type) {
        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public int getType() {
        return type;
    }
}
