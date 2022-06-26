package cglib_dynamic_proxy;


import net.sf.cglib.proxy.Enhancer;

/**
 * cglib动态代理模式
 * 访问代理角色
 * 如：客户联系秘书
 */
public class Client {
    public static void main(String[] args) {
        //jdk生成的 真实类 的代理类
        //cglib提供
        Enhancer enhancer = new Enhancer();

        //生成哪个类的子类
        enhancer.setSuperclass(RealRole.class);

        //当调用子类的时候 的 处理程序 是 代理角色
        //中间真实执行的回调
        enhancer.setCallback(new ProxyRole());

        //产生真实对象的子类
        RealRole realRole = (RealRole)enhancer.create();
        realRole.Eating();
        realRole.MakeTarget();
    }
}

