package cn.edu.ccut.exception2.impl;

import cn.edu.ccut.exception2.ISException2;

public class ISExceptionImpl2 implements ISException2 {
    @Override
    public void exception() {
        //int i = 5/0;
        System.out.println("测试方法 exception2");
    }
}
