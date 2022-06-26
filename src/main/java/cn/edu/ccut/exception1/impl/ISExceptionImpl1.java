package cn.edu.ccut.exception1.impl;

import cn.edu.ccut.exception1.ISException1;

public class ISExceptionImpl1 implements ISException1 {
    @Override
    public void exception() {
        int i = 5/0;
        System.out.println("测试方法 exception1");
    }
}
