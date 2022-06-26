package static_proxy;

/**
 * 静态代理模式
 * 访问代理角色
 * 如：客户联系秘书
 */
public class Client {
    public static void main(String[] args) {
        ProxyRole proxy = new ProxyRole();
        proxy.MakeTarget();
        proxy.Eating();
    }
}
