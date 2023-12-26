package com.itcast.innerClass;

//实现接口定义匿名内部类

interface Printable{
	public abstract void print(String message);
}

public class PrintableTest {
	public static void main(String[] args) {
		Printable printer = new Printable() {
			@Override
			public void print(String message) {
				System.out.println(message);
			}
		};
		
		printer.print("这是惠普打印机");
	}
}
