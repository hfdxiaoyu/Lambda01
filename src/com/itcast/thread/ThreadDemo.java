package com.itcast.thread;


/**
 * 继承Thread类 实现多线程
 * @author 13069
 *
 */
public class ThreadDemo extends Thread {
	
	
	public ThreadDemo(String name) {
		super(name);
	}

	//重写run方法实现多线程
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName()+"=" +i);
			try {
				Thread.sleep((int)(Math.random() * 100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(getName()+"  结束");
	}
	
	public static void main(String[] args) {
		Thread thread1 = new ThreadDemo("线程A");
		Thread thread2 = new ThreadDemo("线程B");
		thread1.start();
		thread2.start();
	}
	
}
