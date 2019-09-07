package com.fxy.parttern.delegate;

public class Boss {

    public void commond(String job,Leader leader){
        leader.assign(job);
    }
}
