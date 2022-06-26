Schema-based用的少，但要掌握

所遇到的问题及其解决办法：

1、在eclipse中实现Schema-based的AOP，但是导入spring-core、spring-aop等jar包，
在完成applicationContext.xml的<aop:config>配置时，在测试文件的
ApplicationContext ac = new ClassPathXMLContext("applicationContext.xml");
报错：bean创建失败异常
在<aop:pointcut expression="execution(* com.bjsxt.test.Demo.demo2())" id="mypoint"/>报错
尝试方法：
    1、更换jdk
    2、改变aop的语法
没有解决
可能原因：aop的jar包版本问题
        就像在idea的maven实现Schema-based的aop，
        这是网上的文章，直接拿来解释（原因:jar包冲突，我引入了spring的其他包，包含了spring-core，
        且版本为4.3.16.RELEASE，而我自己引入的spring-core版本为4.1.1.RELESASE，
        从而导致spring-core包版本不一致产生了冲突，最后运行报错。）

*******************************************************************

2、在idea maven遇到的问题
A.  AOP实例代码文章：https://blog.csdn.net/qq_21046965/article/details/85642070
    新建maven项目
    在设置中指定maven的资源路径
    在pom.xml引入jar包
    编写类和applicationContext.xml
问题：ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
     ApplicationContext和ClassPathXmlApplicationContext显示无法解析
解决：鼠标放上去，然后点击“maven寻找依赖”，然后选择
     org.springframework.context.ApplicationContext;
     org.springframework.context.support.ClassPathXmlApplicationContext;
然后：在pom.xml文件中增加了
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>4.1.6.RELEASE</version>
        </dependency>
也就是这里，出现了后来的jar包冲突，发生了下面的 B选项 错误
因为 <version>4.1.6.RELEASE</version> 导入的时 5.0.0的版本
后来根据文章：https://blog.csdn.net/weixin_30947043/article/details/97200766
把版本更改和  <artifactId>spring-aop</artifactId> 的版本一样

B.  org/springframework/core/ResolvableTypeProvider
    与上面的解释一样，jar包冲突

*******************************************************************

3、然后就可已编译，但是发生了applicationContext.xml文件找不到。。。。。。。
报错：class path resource [.xml] cannot be opened because it does not exist
参考文章：https://blog.csdn.net/baidu_32045201/article/details/78386058
采用了
    在src/main目录下新建一个文件夹，建议取名resources
    点击 File -> Project Structure（或快捷键 Ctrl+Alt+Shift+S）
    点击 Modules- -> Sources 将新建的文件夹标记为 Resources
    将 applicationContext.xml 放入resources文件夹
    重新编译运行即可
当时找不到的时候，百度了一个教程，然后配置了pom.xml，不知到有没有作用
    <build>
            <resources>
                <resource>
                    <directory>src/main/java</directory>
                    <includes>
                        <include>**/*.xml</include>
                    </includes>
                </resource>
            </resources>
        </build>

----- 没有作用 ------


成功运行。。。。。。。。。。。