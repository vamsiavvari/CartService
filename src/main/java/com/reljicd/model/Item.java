package com.reljicd.model;

import java.math.BigDecimal;

import javax.validation.constraints.Pattern;

public class Item {
	
	Integer itemid;
    Integer qty;
    String qty_type;
    BigDecimal cost;
    @Pattern(regexp = "INR")
    String currency;

    public Item(Integer itemid, Integer qty, String qty_type, BigDecimal cost, @Pattern(regexp = "INR") String currency) {
        this.itemid = itemid;
        this.qty = qty;
        this.qty_type = qty_type;
        this.cost = cost;
        this.currency = currency;
    }

    public Item() {
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getQty_type() {
        return qty_type;
    }

    public void setQty_type(String qty_type) {
        this.qty_type = qty_type;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Items{" +
                "itemid=" + itemid +
                ", qty=" + qty +
                ", qty_type='" + qty_type + '\'' +
                ", cost=" + cost +
                ", currency='" + currency + '\'' +
                '}';
    }

}
