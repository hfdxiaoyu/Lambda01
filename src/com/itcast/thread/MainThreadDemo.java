package com.itcast.thread;

/**
 * 主线程
 * @author 13069
 *
 */
public class MainThreadDemo {
	public static void main(String[] args) {
		//返回当前线程对象
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		//获取线程的名字
		System.out.println(thread.getName());
		//设置线程名字
		thread.setName("MyThread");
		//Thread[MyThread,5,main] 5是线程优先级
		System.out.println(thread);
	}
	
}
