package com.course.testng;

import org.testng.annotations.Test;

/**
 * 忽略测试
 *
 * @author sunqiaoling sunqiaoling@3vjia.com
 * @since 2019-09-12 09:38
 */
public class IgnoreTest {
    @Test
    public void ignore1(){
        System.out.println("ignore1 执行");
    }
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 执行");
    }
    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3 执行");
    }
}