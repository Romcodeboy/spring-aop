package cglib_dynamic_proxy;

/**
 * jdk动态代理模式
 * 真实角色
 * 如：总裁
 */
public class RealRole{
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

    public void MakeTarget(){
        System.out.println("制定目标");
    }

    public void Eating(){
        System.out.println("制定目标");
    }
}
