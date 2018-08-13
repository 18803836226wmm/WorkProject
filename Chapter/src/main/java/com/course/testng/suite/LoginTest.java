package com.course.testng.suite;

import org.testng.annotations.Test;

//逻辑控制类，写我们主要的测试主要的test标签包含的方法
public class LoginTest {
    @Test
    public void loginTaobao()
    {
        System.out.println("淘宝登录成功啦");
    }
}
