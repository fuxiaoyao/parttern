package com.fxy.parttern.proxy.jdkproxy;

public class FirstTest implements ITestJdkProxy {
    @Override
    public void hello() {
        System.out.println("hello, I am first");
    }
}
