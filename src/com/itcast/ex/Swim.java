package com.itcast.ex;

//lambda表达式练习10.1 书上P206

public class Swim {
	public static void main(String[] args) {
		Swims s1 = ()->System.out.println("我会游泳1");
		Flyable f1 = ()->System.out.println("我会飞1");
	}
}

@FunctionalInterface
interface Swims{
	void swim();
}

@FunctionalInterface
interface Flyable{
	void fly();
}

class Duck implements Swims,Flyable{

	@Override
	public void fly() {
		System.out.println("我会飞");
	}

	@Override
	public void swim() {
		System.out.println("我会游泳");
	}
	
}