package com.course.testng;

import org.testng.annotations.Test;

/**
 * 异常测试
 *什么时候会用到异常测试？
 *在我们期望结果为某一个异常的时候
 * 比如：我们传入了某些不合法的参数，程序抛出了异常
 * 也就是说我的预期结果就是这个异常
 * @author sunqiaoling sunqiaoling@3vjia.com
 * @since 2019-09-12 10:15
 */
public class ExpectedException{
    //这是一个测试结果失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }
    //这是一个测试结果成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这个是我的异常测试");
        throw new RuntimeException();
    }
}