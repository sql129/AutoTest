package com.course.testng.suite;

import org.testng.annotations.Test;

/**
 * 支付测试
 *
 * @author sunqiaoling sunqiaoling@3vjia.com
 * @since 2019-09-11 18:30
 */
public class PayTest {
    @Test
    public void paySuccess(){
        System.out.println("支付宝支付成功");
    }
}