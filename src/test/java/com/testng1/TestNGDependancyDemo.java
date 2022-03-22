package com.testng1;

import org.testng.annotations.Test;

public class TestNGDependancyDemo {

    @Test(dependsOnMethods = {"test2","test3"})
    public void test1(){
        System.out.println("inside test1");
    }
    @Test
    public void test2() {
        System.out.println("inside test2");
    }
    @Test
    public void test3() {
        System.out.println("inside test3");
    }
}
