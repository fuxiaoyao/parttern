package com.fxy.parttern.delegate;

public class EmployeeB implements IEmployee{

    @Override
    public void doing(String job) {
        System.out.println("我是EmployeeB,我擅长架构,开始执行"+job);
    }

}
