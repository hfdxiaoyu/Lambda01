package com.itcast.generics;

//泛型学习

//T表示类型
public class Node<T> {
	private T value; //泛型成员
	//默认构造方法
	public Node() {
		// TODO Auto-generated constructor stub
	}
	//带参数构造方法
	public Node(T value) {
		super();
		this.value = value;
	}
	//访问方法定义
	public T getValue() {
		return value;
	}
	//修改方法定义
	public void setValue(T value) {
		this.value = value;
	}
	//显示类型名
	public void showType() {
		System.out.println("T的类型是："+value.getClass().getName());
	}
	
	public static void main(String[] args) {
		Node<Integer> intNode = new Node<Integer>();
		intNode.setValue(new Integer(999));
		System.out.println(intNode.getValue());
		intNode.showType();
	}
}
