package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * 类分组测试
 *
 * @author sunqiaoling sunqiaoling@3vjia.com
 * @since 2019-09-12 10:00
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("GroupsOnClass3中的teacher1运行");
    }
    public void teacher2(){
        System.out.println("GroupsOnClass3中的teacher2运行");
    }
}