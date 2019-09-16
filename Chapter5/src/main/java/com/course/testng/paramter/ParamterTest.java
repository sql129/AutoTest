package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * 参数化测试
 *
 * @author sunqiaoling sunqiaoling@3vjia.com
 * @since 2019-09-12 15:53
 */
public class ParamterTest {
    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name,int age){
        System.out.println("name="+name+":"+"age="+age);
    }
}