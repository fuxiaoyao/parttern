package com.fxy.parttern.strategy;

import org.springframework.util.StringUtils;

public class Order {

    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }
    public ResultMsg pay(String paytKey){
        PayMent payMent = PayStategy.get(paytKey);
        System.out.println("本次交易使用："+payMent.getName());
        System.out.println("交易金额："+amount+",开始扣款...");
        return PayStategy.get(paytKey).pay(uid, amount);
    }
}
