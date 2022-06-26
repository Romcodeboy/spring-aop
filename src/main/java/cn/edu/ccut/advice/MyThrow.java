package cn.edu.ccut.advice;

import org.springframework.aop.ThrowsAdvice;

/**
 * 异常通知(Schema-based 方式
 */
public class MyThrow implements ThrowsAdvice {
    public void afterThrowing(Exception ex) throws Throwable {
        System.out.println("执行异常通过-schema-base 方式 ");
    }

    //     public void afterThrowing(Method m, Object[] args,Object target, Exception ex) {
    //       System.out.println("执行异常通知");
    //     }
}
