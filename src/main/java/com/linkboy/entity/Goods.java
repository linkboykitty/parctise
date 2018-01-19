package com.linkboy.entity;

public class Goods {
    private Long g_id;
    private Long g_sort;
    private double g_price;
    private int g_num;

    public Long getG_id() {
        return g_id;
    }

    public void setG_id(Long g_id) {
        this.g_id = g_id;
    }

    public Long getG_sort() {
        return g_sort;
    }

    public void setG_sort(Long g_sort) {
        this.g_sort = g_sort;
    }

    public double getG_price() {
        return g_price;
    }

    public void setG_price(double g_price) {
        this.g_price = g_price;
    }

    public int getG_num() {
        return g_num;
    }

    public void setG_num(int g_num) {
        this.g_num = g_num;
    }
}
