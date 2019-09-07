package com.fxy.parttern.delegate;

import java.util.HashMap;

public class Leader {
    private HashMap<String,IEmployee> employees = new HashMap<>();

    public Leader(){
        employees.put("加密", new EmployeeA());
        employees.put("架构", new EmployeeB());
    }
    public void assign(String job){
        employees.get(job).doing(job);
    }
}
