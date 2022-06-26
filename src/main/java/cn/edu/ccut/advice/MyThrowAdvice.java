package cn.edu.ccut.advice;

/**
 * 配置异常通知的步骤(AspectJ 方式)
 */
public class MyThrowAdvice{
    public void myException(Exception e1){
        System.out.println("执行异常通知 "+e1.getMessage());
    }
}
