package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * DataProvider参数化
 *
 * @author sunqiaoling sunqiaoling@3vjia.com
 * @since 2019-09-12 18:14
 */
public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name="+name+":"+"age="+age);
    }
    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o =new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };
        return o;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
       System.out.println("test1方法name="+name+":"+"age="+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2方法name="+name+":"+"age="+age);
    }
    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;
        if(method.getName().equals("test1")){
            result =new Object[][]{
                    {"zhangsan",15},
                    {"lisi",25}
            };
        }else if(method.getName().equals("test2")){
            result =new Object[][]{
                    {"wangwu",35},
                    {"zhouliu",45}
            };

        }
        return result;

    }
}