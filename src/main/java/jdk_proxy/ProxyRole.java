package jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * jdk动态代理模式
 * 代理角色
 * 如：秘书；执行部分功能
 * 重写invoke方法
 * 调用RealRole方法
 */
public class ProxyRole implements InvocationHandler {
    private RealRole real = new RealRole("real");

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("如：预约时间");
        Object object = method.invoke(real,args);
        System.out.println("如：备份访客信息");
        return object;
    }
}
