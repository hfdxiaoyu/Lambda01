package com.itcast.jdk11;


import java.util.function.Consumer;

/**
 * String 新增操作以及var关键字
 */
public class Stringoption {
    public static void main(String[] args) {
        // 编译器能根据右边的表达式自动推断类型
        // var的好处是在使用lambda表达式时给参数加上注解
        //var“关键字”并非正式的关键字，变量依旧可以用var命名，var“关键字”只是一个语法糖
        var str = "起飞";
        System.out.println(str.getClass());
        Consumer<Integer> consumer = (@Deprecated var x) -> System.out.println(x);

        //新增字符串处理方法
        //判断字符串是否为空
        //isBlank 跟 isEmpty 的区别  \n \t 这些会被判空白
        //strip与trim的区别时trim不能去除非英文的空格，strip可以去除所有字符集的空格
        System.out.printf("字符串是否为空：%b \n","\t".isBlank());
        System.out.printf("字符串 str 是否为空：%b \n",str.isBlank());
        var content = "  \t \nb \na content ";
        System.out.println("去除手尾空格："+content.strip());
        System.out.println("去除首部空格："+content.stripLeading());
        System.out.println("去除尾部空格："+content.stripTrailing());
        System.out.println("复制字符串"+content.repeat(3));
        System.out.println("行数统计："+content.lines().count());

        //文本块
        String query = """
           SELECT * from USER \
           WHERE `id` = 1 \
           ORDER BY `id`, `name`;\
           """;
        System.out.println(query);
    }

}
