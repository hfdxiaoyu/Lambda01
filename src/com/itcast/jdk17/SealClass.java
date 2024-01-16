package com.itcast.jdk17;

/**
 * 密封类
 * 可以限制类的层次结构
 */
// 添加sealed修饰符，permits后面跟上只能被继承的子类名称
public sealed class SealClass permits Teacher1,Worker,Student1 {

}

// 子类可以被修饰为 final
final class Teacher1 extends SealClass{} //教师

// 子类可以被修饰为 non-sealed，此时 Worker类就成了普通类，谁都可以继承它
non-sealed class Worker extends SealClass{ } //工人
//任何类都可以继承Worker
class AnyClass extends Worker{}
//子类可以被修饰为 sealed,同上
sealed class Student1 extends SealClass permits MiddleSchoolStudent,GraduateStudent{}

final class MiddleSchoolStudent extends Student1 { }  //中学生

final class GraduateStudent extends Student1 { }  //研究生