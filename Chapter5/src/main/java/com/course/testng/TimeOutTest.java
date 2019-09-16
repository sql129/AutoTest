package com.course.testng;

import org.testng.annotations.Test;

/**
 * 超时测试
 *
 * @author sunqiaoling sunqiaoling@3vjia.com
 * @since 2019-09-16 11:20
 */
public class TimeOutTest {
    @Test(timeOut = 3000)//单位为毫秒
    public void testSucess() throws InterruptedException{
        Thread.sleep(2000);
    }
    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException{
        Thread.sleep(3000);
    }
}