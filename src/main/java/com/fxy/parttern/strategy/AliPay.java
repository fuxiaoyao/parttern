package com.fxy.parttern.strategy;

public class AliPay extends PayMent {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    public double queryBalance() {
        return 200;
    }
}
