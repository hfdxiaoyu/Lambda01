package com.itcast.thread;


/**
 * 使用监视器模型的box对象
 * @author 13069
 *
 */
public class MonitorBox {
	private int data;
	private boolean available = false; //用来表示数据是否可用
	public synchronized void put(int value) {
		//数据没取出
		while (available==true) {
			try {
				//当前线程等待
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(System.out);
			}
		}
		data = value; //产生数据
		available = true;
		notifyAll(); //通知所有等待的线程继续执行
	}
	
	public synchronized int get() {
		while(available == false) {//还没有数据
			try {
				wait();//当前线程等待
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(System.out);
			}
		}
		available = false;
		notifyAll(); //通知所有等待的线程继续执行
		return data;
	}
	
}
