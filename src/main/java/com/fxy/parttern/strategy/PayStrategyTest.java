package com.fxy.parttern.strategy;

public class PayStrategyTest {
    public static void main(String[] args) {
        Order order = new Order("123", "3werewrewrwerewr", 223);
        ResultMsg resultMsg = order.pay(PayStategy.JD_PAY);
        System.out.println(resultMsg);
    }
}
