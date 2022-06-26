package cn.edu.ccut.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTestAspect {
    /**
     * 简单测试demo类
     */
    public static void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext4.xml");
        Demo demo = ac.getBean("demo",Demo.class);
        //demo.demo1();
        demo.demo2();
    }

    /**
     * aspectJ方式
     * 绑定通知类，将参数传递给通知类
     */
    public static void test2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext4.xml");
        Demo demo = ac.getBean("demo",Demo.class);
        //demo.demo1();
        demo.demo2("jack",20);
    }

    public static void main(String[] args) {
        test2();
    }
}
