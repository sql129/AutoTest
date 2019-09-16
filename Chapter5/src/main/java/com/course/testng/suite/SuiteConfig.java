package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * suite配置类
 *
 * @author sunqiaoling sunqiaoling@3vjia.com
 * @since 2019-09-11 17:58
 */
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite运行啦");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite运行啦");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }

}