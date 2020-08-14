package com.cmgun.controller;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by cmgun on 2020/8/14
 */
public class Entity {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
