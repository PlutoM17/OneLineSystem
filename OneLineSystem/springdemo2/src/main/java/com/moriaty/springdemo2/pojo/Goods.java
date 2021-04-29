package com.moriaty.springdemo2.pojo;

public class Goods {
    private int goods_id;
    private String goods_name;
    private String class_code;
    private String single_cost;
    private String single_price;
    private String single_bonus;
    private String goods_stock;

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getClass_code() {
        return class_code;
    }

    public void setClass_code(String class_code) {
        this.class_code = class_code;
    }

    public String getSingle_cost() {
        return single_cost;
    }

    public void setSingle_cost(String single_cost) {
        this.single_cost = single_cost;
    }

    public String getSingle_price() {
        return single_price;
    }

    public void setSingle_price(String single_price) {
        this.single_price = single_price;
    }

    public String getSingle_bonus() {
        return single_bonus;
    }

    public void setSingle_bonus(String single_bonus) {
        this.single_bonus = single_bonus;
    }

    public String getGoods_stock() {
        return goods_stock;
    }

    public void setGoods_stock(String goods_stock) {
        this.goods_stock = goods_stock;
    }
}
