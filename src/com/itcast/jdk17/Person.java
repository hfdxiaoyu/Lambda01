package com.itcast.jdk17;

/**
 * 其效果有些类似 Lombok 的 @Data 注解、Kotlin 中的 data class，
 * 但是又不尽完全相同，它们的共同点都是类的部分或者全部可以直接在类头中定义、描述，并且这个类只用于存储数据而已。
 *
 *
 *当用 Record 来声明一个类时，该类将自动拥有下面特征：
 * 拥有一个构造方法获取成员属性值的方法：name()、age()hashCode()
 * 方法和 euqals() 方法toString() 方法类对象和属性被 final
 * 关键字修饰，不能被继承，类的示例属性也都被 final 修饰，不能再被赋值使用。
 * 还可以在 Record 声明的类中定义静态属性、方法和示例方法。注意，不能在 Record
 * 声明的类中定义示例字段，类也不能声明为抽象类等。可以看到，该预览特性提供了一
 * 种更为紧凑的语法来声明类，并且可以大幅减少定义类似数据类型时所需的重复性代码。
 * @param name
 * @param age
 */
public record Person(String name,int age) {
    public static String address;
}
