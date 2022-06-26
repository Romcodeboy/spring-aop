package cn.edu.ccut.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 环绕通知(Schema-based 方式
 */
public class MyArround implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation arg0) throws Throwable {
        System.out.println("环绕-前置");
        Object result = arg0.proceed();//放行,调用切点方式
        System.out.println("环绕-后置");
        return result;
    }
}