package jdk_proxy;

import java.lang.reflect.Proxy;

/**
 * jdk动态代理模式
 * 访问代理角色
 * 如：客户联系秘书
 * ClassLoader是一样的，jvm只有一个ClassLoader
 * 利用反射机制，传入接口类，通过代理角色，
 * 在代理角色中处理invoke函数，当调用的args传入时，
 * 调用相应的真实角色的执行函数
 */
public class Client {
    public static void main(String[] args) {
        ProxyRole proxy = new ProxyRole();
        Function function = (Function) Proxy.newProxyInstance(
                            Client.class.getClassLoader(),
                            new Class[]{Function.class},
                            proxy);
        function.MakeTarget();
        function.Eating();
    }
}

