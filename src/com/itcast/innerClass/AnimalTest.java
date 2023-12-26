package com.itcast.innerClass;

//继承类定义匿名内部类

class Animal{
	public void eat() {
		System.out.println("I like eat anthing.");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		Animal dog = new Animal() {//继承Animal类，重写eat类

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("I like eat bones.");
			}
			
		}; //这里分号是赋值语句的结束
		dog.eat();
	}
}

