package cglib_dynamic_proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * jdk动态代理模式
 * 代理角色
 * 如：秘书；执行部分功能
 */
public class ProxyRole implements MethodInterceptor {

    /**
     * @param o             生成的子类对象
     * @param method        代理的方法
     * @param objects       参数
     * @param methodProxy   生成的子类的代理方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("如：预约时间");
        //invoke()调用子类重写方法
        //method.invoke(o,objects);
        //methodProxy.invoke(o,objects);
        // 自己调自己 没有调父类的方法 死循环 methodProxy.invoke(o,objects);

        //调用父类方法
        methodProxy.invokeSuper(o,objects);

        System.out.println("如：备份访客信息");
        return null;
    }
}
