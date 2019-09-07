package com.fxy.parttern.delegate;

public class EmployeeA implements IEmployee{

    @Override
    public void doing(String job) {
        System.out.println("我是EmployeeA,我擅长加密,开始执行"+job);
    }

}
