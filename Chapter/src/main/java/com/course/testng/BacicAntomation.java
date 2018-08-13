package com.course.testng;

import org.testng.annotations.*;

public class BacicAntomation {
    //这是最基本的注解，用来把方法标记为测试的一部分
    @Test
    public  void  testCase1()
    {
        System.out.println("这是测试用例1");

    }
    @Test
    public void testCase2()
    {
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void  beforeMethod()
    {
        System.out.println("BeforeMethod这是在测试方法之前运行的");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("AfterMethod这是在测试方法之后运行的");
    }
    //试用环境
    //在我运行这个类之前是否需要给他类使用之前一些静态类的使用、
    //注册对象、静态方法，变量赋值
    @BeforeClass
    public  void beforeClass()
    {
        System.out.println("BeforeClass这是在类之前运行的方法");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("AfterClass这是在类之后运行的方法");
    }
    //套件在类的运行之前。套件可能包括好多个类。
    //套件测试
    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("BeforeSuite测试套件");
    }
    @AfterSuite
    public void afterSuite()
    {
        System.out.println("AfterSuite测试套件");
    }
}
