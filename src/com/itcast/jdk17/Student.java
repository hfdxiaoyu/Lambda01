package com.itcast.jdk17;

//用来测试instanceof
public class Student implements Common {
    public String name;
    public String age;
    public String text;

    @Override
    public void say() {
        System.out.println("我是学生：下面由我说几句！");
    }
}
