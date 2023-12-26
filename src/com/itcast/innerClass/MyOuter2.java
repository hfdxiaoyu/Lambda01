package com.itcast.innerClass;

public class MyOuter2 {
	String s1 = "Hello";
	static String s2 = "World";
	//内部接口的声明
	interface MyInterface{
		void show();
	}
	
	static class MyInner2 implements MyInterface{

		@Override
		public void show() {
			System.out.println("s1 = "+new MyOuter2().s1);
			System.out.println("S2 = "+ s2); //可以访问外部类的static变量
		}
		
	}
	
	public static void main(String[] args) {
		MyOuter2.MyInner2 inner2 = new MyOuter2.MyInner2();
		inner2.show();
	}
}
