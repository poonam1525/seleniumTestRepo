package com.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyTest1 {
    private static Logger logger = LogManager.getLogger(MyTest1.class);

    public static void main(String[] args) {
        logger.debug("This is a MyTest1 debug message");
        logger.info("This is an MyTest1 info message");
        logger.warn("This is a MyTest1 warn message");
        logger.error("This is MyTest1 error message");
        logger.fatal("This is MyTest1 fatal message");
    }
}
