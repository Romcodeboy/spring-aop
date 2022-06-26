
package cn.edu.ccut.test;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class Demo1 {

    @Pointcut("execution(* cn.edu.ccut.test.Demo1.demo1())")
    public void demo1(){
        //int i = 5/0;
        System.out.println("demo1");
    }
}
