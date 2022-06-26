package cn.edu.ccut.test;

import cn.edu.ccut.exception.ISException;
import cn.edu.ccut.exception.impl.ISExceptionImpl;
import cn.edu.ccut.exception1.ISException1;
import cn.edu.ccut.exception1.impl.ISExceptionImpl1;
import cn.edu.ccut.exception2.ISException2;
import cn.edu.ccut.exception2.impl.ISExceptionImpl2;
import cn.edu.ccut.service.IStudentService;
import cn.edu.ccut.service.impl.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 基于Schema-based的 advice实现
 */
public class SpringTest {

    /**
     * 测试前置通知、后置通知
     * @throws Exception
     */
    public static void testApplicationContext() throws Exception{
        //加载spring配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取IStudentService
        IStudentService studentService = ac.getBean("studentService", StudentServiceImpl.class);
        studentService.show();
    }

    /**
     * 配置异常通知的步骤(AspectJ 方式)
     * @throws Exception
     */
    public static void testApplicationContext1() throws Exception{
        //加载spring配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext1.xml");
        //获取IStudentService
        ISException isException = ac.getBean("isMyException", ISExceptionImpl.class);
        isException.exception();
    }
    /*
    * 执行了MyThrowAdvice
    * 结果：
    *    执行异常通知 / by zero；
    *    java.lang.ArithmeticException: / by zero；
    * */

    /**
     * 异常通知(Schema-based 方式
     * @throws Exception
     */
    public static void testApplicationContext2() throws Exception{
        //加载spring配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext2.xml");
        //获取IStudentService
        ISException1 isException = ac.getBean("isMyException", ISExceptionImpl1.class);
        isException.exception();
    }

    /**
     * .环绕通知(Schema-based 方式
     * @throws Exception
     */
    public static void testApplicationContext3() throws Exception{
        //加载spring配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext3.xml");
        //获取IStudentService
        ISException2 isException = ac.getBean("isMyException", ISExceptionImpl2.class);
        isException.exception();
    }

    public static void main(String[] args) {
        try {
            testApplicationContext3();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}