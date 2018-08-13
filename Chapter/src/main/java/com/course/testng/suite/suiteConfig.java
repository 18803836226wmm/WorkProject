package com.course.testng.suite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;


//在Resource文件夹下面创建一个xml文件，testng学习最重要的也是xml文件的配置。
/*
这个xml文件跟LoginTest、suiteConfig文件是有关联的
<suite name="test">//最新运行控件test，再运行下面的test
    <test name="Login">
        <classes>
            <class name="com.course.testng.suite.suiteConfig"/>
            <class name="com.course.testng.suite.LoginTest"/>
        </classes>
    </test>
    <test name="Pay">
        <classes>
            <class name="com.course.testng.suite.suiteConfig"/>
            <class name="com.course.testng.suite.PayTest"/>
        </classes>
    </test>
</suite>
*/



//用于我们所有套件测试的一个配置类
//测试之前：写我们测试之前需要运行的方法、运行的共有的东西
public class suiteConfig {
    @BeforeSuite
    public void beforeSuite()
    {
        //System.out.println("beforeSuite运行啦！");
        System.out.println("我是一只大花猫，喵喵喵喵");
        System.out.println("beforeSuite运行啦！");
    }
    @AfterSuite
    public void afterSuite()
    {
        System.out.println("afterSuite运行啦！");
    }
    @BeforeTest
    public void beforeTest()
    {
       System.out.println("beforeTest");
    }
    @AfterTest
    public void afterTest()
    {
System.out.println("afterTest");
    }

}
