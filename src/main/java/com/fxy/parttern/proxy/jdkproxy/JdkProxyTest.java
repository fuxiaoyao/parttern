package com.fxy.parttern.proxy.jdkproxy;

public class JdkProxyTest {
    public static void main(String[] args) {
        ITestJdkProxy instance = (ITestJdkProxy)new JdkInvocationHandler().getInstance(new FirstTest());
        instance.hello();
    }
}
