package cn.edu.ccut.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvices {
//    public void before(){
//        System.out.println("前置通知");
//    }

    public void before(String name,int age){
        System.out.println("前置通知:"+name+" "+age);
    }

    public void after(){
        System.out.println("后置通知");
    }

    public void afterRunning(){
        System.out.println("后置通知 ing");
    }

    public void throwException(){
        System.out.println("异常通知");
    }

    public Object myAround(ProceedingJoinPoint p) throws Throwable {
        System.out.println("执行环绕");
        System.out.println("环绕-前置");
        Object result = p.proceed();
        System.out.println("环绕-后置");
        return result;
    }
}
