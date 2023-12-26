package com.itcast.thread;

import java.time.LocalDateTime;

/**
 * 控制线程的结束
 * @author 13069
 *
 */
public class ThreadStop {
	
	//静态内部类
	static class MyTimer implements Runnable{
		//定义一个标志变量
		boolean flag = true;
		
		@Override
		public void run() {
			while (flag) {
				System.out.println("" + LocalDateTime.now() + " ...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(""+Thread.currentThread().getName()+" 结束");
		}
		
		public void stopRun() {
			//将标志变量设置为false
			flag = false;
		}
	}
	
	public static void main(String[] args) {
		MyTimer timer = new MyTimer();
		Thread thread = new Thread(timer);
		thread.setName("Timer");
		thread.start();
		for (int i = 0; i < 100; i++) {
			System.out.println(""+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//使用户线程结束
		timer.stopRun();
		
	}
}
