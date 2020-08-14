package com.cmgun.controller;

/**
 * Created by cmgun on 2020/8/14
 */
public class Req<T> {

    public T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
