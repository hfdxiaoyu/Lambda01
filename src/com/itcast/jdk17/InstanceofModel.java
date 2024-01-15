package com.itcast.jdk17;

/**
 * JDK16 - instanceof 模式匹配
 */
public class InstanceofModel {
    public static void main(String[] args) {
        InstanceofModel instanceofModel = new InstanceofModel();
        instanceofModel.TpSay(new Teacher());
    }

    /**
     * 首先在 if 代码块中，对 person 对象进行类型匹配，校验 person 对象是否为 Student 类型，
     * 如果类型匹配成功，则会转换为 Student 类型，并赋值给模式局部变量 student，
     * 并且只有当模式匹配表达式匹配成功是才会生效和复制，同时这里的 student 变
     * 量只能在 if 块中使用，而不能在 else if/else 中使用，否则会报编译错误。
      * @param person
     */
    public void TpSay(Object person){
        if (person instanceof Student student){
            student.say();
        } else if (person instanceof Teacher teacher){
            teacher.say();
        }

    }
}
