package com.itcast.jdk11;

/**
 * 模式匹配
 */
public class switchmodel {
    public static void main(String[] args) {
        switchmodel switchmodel1 = new switchmodel();

        System.out.println(switchmodel1.dayWeek("FRIDAY"));


    }

    /**
     * switch 表达式将之前 switch 语句从编码方式上简化了不少，但是还是需要注意下面几点：
     * 需要保持与之前 switch 语句同样的 case 分支情况。之前需要用变量来接收返回值，
     * 而现在直接使用 yield 关键字来返回 case 分支需要返回的结果。
     * 现在的 switch 表达式中不再需要显式地使用 return、break 或者 continue 来跳出当前分支。现在不需要像之前一样，
     * 在每个分支结束之前加上 break 关键字来结束当前分支，如果不加，则会默认往后执行，
     * 直到遇到 break 关键字或者整个 switch 语句结束，在 Java 14 表达式中，
     * 表达式默认执行完之后自动跳出，不会继续往后执行。对于多个相同的 case 方法块，
     * 可以将 case 条件并列，而不需要像之前一样，通过每个 case 后面故意不加 break 关键字来使用相同方法块
     * @param day_
     * @return
     */
    //根据输入输出数字周几
    int dayWeek(String day_){
        int dayOfWeek = switch (day_){
            case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
            case "TUESDAY" -> 7;
            case "THURSDAY", "SATURDAY" -> 8;
            case "WEDNESDAY" -> 9;
            default -> 0;
        };
        return dayOfWeek;
    }
}
