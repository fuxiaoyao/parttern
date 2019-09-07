package com.fxy.parttern.strategy;

public class WechatPay extends PayMent {
    @Override
    public String getName() {
        return "微信";
    }

    @Override
    public double queryBalance() {
        return 300;
    }
}
