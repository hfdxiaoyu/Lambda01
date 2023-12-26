package com.itcast.la;

import java.util.Scanner;

public class LmbdaWriter03 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		space01<String,String> space01 = (input) -> input;
		System.out.println("请输入一串字符：");
		String str1 = s1.next();
		String s2 = space01.spaker(str1);
		System.out.println(s2);
	}
}

@FunctionalInterface
interface space01<F,T> {
	String spaker(String str1); 
}