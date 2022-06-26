package cn.edu.ccut.exception.impl;

import cn.edu.ccut.exception.ISException;

public class ISExceptionImpl implements ISException {
    @Override
    public void exception() {
        int i = 5/0;
        System.out.println("测试方法");
    }
}
