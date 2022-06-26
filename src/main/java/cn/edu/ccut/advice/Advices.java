package cn.edu.ccut.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Advices {
    @Before("cn.edu.ccut.test.Demo1.demo1()")
    public void before(){
        System.out.println("前置通知");
    }

    @After("cn.edu.ccut.test.Demo1.demo1()")
    public void after(){
        System.out.println("后置通知");
    }

    @AfterReturning("cn.edu.ccut.test.Demo1.demo1()")
    public void afterRunning(){
        System.out.println("后置通知 ing");
    }

    @AfterThrowing("cn.edu.ccut.test.Demo1.demo1()")
    public void throwException(){
        System.out.println("异常通知");
    }

    @Around("cn.edu.ccut.test.Demo1.demo1()")
    public Object myAround(ProceedingJoinPoint p) throws Throwable {
        System.out.println("执行环绕");
        System.out.println("环绕-前置");
        Object result = p.proceed();
        System.out.println("环绕-后置");
        return result;
    }
}
