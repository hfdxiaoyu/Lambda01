package com.itcast.thread;


/**
 * 继承Runnable接口实现多线程
 * @author 13069
 *
 */
public class RunnableDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			//currentThread()返回当前执行线程对象的引用
			System.out.println(Thread.currentThread().getName()+" = "+i);
			
			try {
				//使当前线程休眠一段时间
				Thread.sleep((int)(Math.random() * 100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"  结束");
	}
	
	
	public static void main(String[] args) {
		RunnableDemo task = new RunnableDemo();
		Thread thread1 = new Thread(task,"线程 A");
		Thread thread2 = new Thread(task,"线程 B");
		thread1.start();
		thread2.start();
	}
}
