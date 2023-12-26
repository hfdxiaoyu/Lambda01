package com.itcast.innerClass;

//局部内部类
public class OuterClass2 {
	private String x= "hello";
	
	public void makeInner(int param) {
		final String y = "local variable";
		//局部内部类
		class InnerClass {
			public void seeOuter() {
				System.out.println("x = "+x);
				System.out.println("y = "+y);
				System.out.println("param = "+param);
			}
		}
		//调用内部类的方法
		new InnerClass().seeOuter();
	}
	
	public static void main(String[] args) {
		OuterClass2 oc = new OuterClass2();
		oc.makeInner(47);
	}
}
