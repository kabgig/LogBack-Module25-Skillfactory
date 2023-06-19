package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test{
    public static void main(String[] args) {
    final Logger logger = LoggerFactory.getLogger(Test.class);
        logger.info("Test log from {}", Test.class.getSimpleName());
    }
}