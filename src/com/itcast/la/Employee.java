package com.itcast.la;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//构造方法引用
public class Employee {
	public static void main(String[] args) {
		//员工名字
		List<String> names = Arrays.asList("Alexis","anna","Kyleen");
		//想要一个员工列表，每个员工名对应一个员工。不需要使用循环，使用stream就可以将list对象放入流中，
		//并调用map方法。它应用方法并收集结果
		Stream<Employee1> stream = names.stream().map(Employee1::new);
		
		//toArray()方法返回一个Object类型的数组
//		Object [] employeels2 = stream.toArray();
//		for (Object object : employeels2) {
//			System.out.println(object);
//		}
		//toArray(Employee1[]::new)方法调用Employee1构造方法来获得一个正确类型的数组
		Employee1 []employee1s = stream.toArray(Employee1[]::new);
		for (Employee1 employee1 : employee1s) { 
			System.out.println(employee1);
		}
	}
}


class Employee1{
	String name; // 名字

	
	public Employee1() {
		super();
	}


	public Employee1(String name) {
		super();
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee1 [name=" + name + "]";
	}
	
}