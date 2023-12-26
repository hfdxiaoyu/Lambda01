package com.itcast.innerClass;

//学习内部类
//成员内部类

public class OuterClass {
	private int x = 200;
	//内部类
	public class InnerClass{
		int y = 300; 
		public int calculate() {
			//可以访问外层的成员变量x
			return x+y;
		}
	}
	
	private void makeInner() {
		//创建内部类对象
		InnerClass ic = new InnerClass();
		System.out.println(ic.calculate());
	}
	
	public static void main(String[] args) {
//		OuterClass outer = new OuterClass();
		//也可以使用这种方法
		OuterClass.InnerClass inner = new OuterClass().new InnerClass();
		//在外层类的外面要创建内部类的实例先必须创建一个外层类的对象，因为内部类对象对外层类对象有一个隐含的引用
//		OuterClass.InnerClass inner = outer.new InnerClass();
		System.out.println(inner.calculate());
		
		//在使用成员内部类时需要注意下面几个问题
		//成员内部类中不能定义static变量和方法
		//成员内部类也可以使用abstract和final修饰，其含义与其它类一样
		//成员内部类还可以使用private、public、protected或包可访问修饰符
	}
	
}
