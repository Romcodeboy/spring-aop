package cn.edu.ccut.test;

public class Demo {
    public void demo1(){
        System.out.println("demo1");
    }

    public void demo2(){
        int i = 5/0;
        System.out.println("demo2");
    }

    public void demo2(String name,int age){
        System.out.println("demo2:"+name+" "+age);
    }
}
