package com.testng1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore

public class TestNGIgnoreDemo {
    @Test
    public void test1(){
        System.out.println("inside test1");
    }
    @Test
    public void test2() {
        System.out.println("inside test2");
    }
}
