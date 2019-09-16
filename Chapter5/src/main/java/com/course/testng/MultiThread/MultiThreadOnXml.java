package com.course.testng.MultiThread;

import org.testng.annotations.Test;

/**
 * 多线程测试
 *
 * @author sunqiaoling sunqiaoling@3vjia.com
 * @since 2019-09-12 18:55
 */
public class MultiThreadOnXml {
    @Test
    public  void test1(){
        System.out.printf("Thread Id:%s%n",Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("Thread Id:%s%n",Thread.currentThread().getId());
    }
    @Test
    public void tes3(){
        System.out.printf("Thread Id:%s%n",Thread.currentThread().getId());
    }
}