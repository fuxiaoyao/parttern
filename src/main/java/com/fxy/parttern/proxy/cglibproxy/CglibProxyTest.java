package com.fxy.parttern.proxy.cglibproxy;

public class CglibProxyTest {
    public static void main(String[] args) {
        try {
            Person instance = (Person)new CglibProxy().getInstance(Person.class);
            instance.sayHello();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
