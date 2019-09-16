package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * 类分组测试
 *
 * @author sunqiaoling sunqiaoling@3vjia.com
 * @since 2019-09-12 09:59
 */
@Test(groups = "stu")
public class GroupsOnClass1 {
    public void stu1(){
        System.out.println("GroupsOnClass1中的stu1运行");
    }
    public void stu2(){
        System.out.println("GroupsOnClass1中的stu2运行");
    }
}