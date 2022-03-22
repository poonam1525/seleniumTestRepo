package com.testng1;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {

    @Test(priority = 2)
    public void test2(){
        System.out.println("inside method test1" );
    }
    @Test(priority = 0)
    public void test1(){
        System.out.println("inside method test2");
    }
    @Test(priority = 1)
    public void test0(){
        System.out.println("inside method test3");
    }
}
