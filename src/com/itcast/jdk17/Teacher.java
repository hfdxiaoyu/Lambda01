package com.itcast.jdk17;

//用来测试instanceof
public class Teacher implements Common {
    public String name;
    public String age;
    public String professional; //职称

    @Override
    public void say() {
        System.out.println("我是老师：下面由我说几句！");
    }
}
