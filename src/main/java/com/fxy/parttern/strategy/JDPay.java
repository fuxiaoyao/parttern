package com.fxy.parttern.strategy;

public class JDPay extends PayMent {
    @Override
    public String getName() {
        return "京东";
    }

    @Override
    public double queryBalance() {
        return 150;
    }
}
