package cn.edu.ccut.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用注解配置aspectj的aop
 * 注意：<context:component-scan base-package="cn.edu.ccut.advice"></context:component-scan>
 *      要是advice通知所在的包，不是切点pointcut所在的包
 *      扫描有注解的通知
 * 要引入context:component-scan 的命名空间
 * 要学会看官方文档和使用
 */
public class SpringAOPAnnotation {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext5.xml");
        Demo1 demo1 = ac.getBean("demo1",Demo1.class);
        demo1.demo1();
    }
}
