package com.fxy.parttern.strategy;

public abstract class PayMent {
    public abstract String getName();

    protected abstract double queryBalance();

    public ResultMsg pay(String uid,double amount){
        if(queryBalance() < amount){
            return new ResultMsg(500, "支付失败", "支付余额不足");
        }
        return new ResultMsg(200, "支付成功", "支付金额:" + amount);

    }

}
