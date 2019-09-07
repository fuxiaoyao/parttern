package com.fxy.parttern.delegate;

public class DelegateTest {
    public static void main(String[] args) {
        new Boss().commond("架构",new Leader());
    }
}
