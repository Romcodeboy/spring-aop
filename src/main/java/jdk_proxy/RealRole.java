package jdk_proxy;

/**
 * jdk动态代理模式
 * 真实角色
 * 如：总裁
 * 实现接口方法
 */
public class RealRole implements Function{
    private String name;

    public RealRole() {
    }

    public RealRole(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void MakeTarget(){
        System.out.println("制定目标");
    }

    @Override
    public void Eating(){
        System.out.println("制定目标");
    }
}
