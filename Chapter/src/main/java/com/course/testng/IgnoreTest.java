package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest
{
    @Test
    public void ingore1()
    {
        System.out.println("ingore1 执行");
    }
    @Test(enabled = false)
    public void ingore2()
    {
        System.out.println("ingore2 执行");
    }
    @Test(enabled = true)
    public void ingore3()
    {
        System.out.println("ingore3 执行");
    }
}
