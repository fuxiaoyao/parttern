package com.fxy.parttern.strategy;

import java.util.HashMap;

public class PayStategy {
    public static final String ALI_PAY = "AliPay";
    public static final String JD_PAY = "JdPay";
    public static final String WECHAT_PAY = "WechatPay";
    public static final String DEFAULT_PAY = "AliPay";

    private static HashMap<String, PayMent> payStategy = new HashMap<>();

    static {
        payStategy.put(ALI_PAY, new AliPay());
        payStategy.put(JD_PAY, new JDPay());
        payStategy.put(WECHAT_PAY, new WechatPay());
    }

    public static PayMent get(String paykey){
        if(!payStategy.containsKey(paykey)){
            return payStategy.get(DEFAULT_PAY);
        }
        return payStategy.get(paykey);
    }
}
