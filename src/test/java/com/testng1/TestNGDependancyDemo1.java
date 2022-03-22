package com.testng1;

import org.testng.annotations.Test;

public class TestNGDependancyDemo1 {
    @Test(dependsOnMethods = {"test2"},priority = 1)
    public void test1(){
        System.out.println("inside test1");
    }
    @Test(priority = 2)
    public void test2() {
        System.out.println("inside test2");
    }
}
