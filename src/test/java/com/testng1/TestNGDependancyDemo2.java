package com.testng1;

import org.testng.annotations.Test;

public class TestNGDependancyDemo2 {
    @Test(dependsOnGroups = {"sanity.*"})
    public void test1(){
        System.out.println("inside test1");
    }
    @Test(groups={"sanity1"})
    public void test2() {
        System.out.println("inside test2");
    }
    @Test(groups={"sanity2"})
    public void test3() {
        System.out.println("inside test3");
    }
}

