package static_proxy;

/**
 * 静态代理模式
 * 代理角色
 * 如：秘书；执行部分功能
 */
public class ProxyRole implements Function{
    private RealRole real = new RealRole("real");

    @Override
    public void MakeTarget() {
        System.out.println("如：预约时间");
        real.MakeTarget();
        System.out.println("如：备份访客信息");
    }

    @Override
    public void Eating() {
        System.out.println("如：预约时间");
        real.Eating();
        System.out.println("如：备份访客信息");
    }
}
