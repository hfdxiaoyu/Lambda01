package com.itcast.thread;

/**
 * 盒子
 * 线程协调，不正确的写法
 * @author 13069
 * 首先设计用于存储数据的box类
 */
public class Box {
	private int data;
	//synchronized 关键字加在这方法同步
	public synchronized void put(int value){
		data = value;
	}
	public synchronized int get() {
		return data;
	}
}
