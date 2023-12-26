package com.itcast.thread;

/**
 * 线程优先级和调度
 * @author 13069
 *
 */
public class ThreadPriorityDemo {
	
	//静态内部类
	static class CounterThread extends Thread{

		@Override
		public void run() {
			int count = 0;
			while (true) {
				try {
					sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (count == 5000) 
					break;
				System.out.println(getName() + ":" + count++);
			}
		}
		
	}
	
	public static void main(String[] args) {
		CounterThread thread1 = new CounterThread();
		CounterThread thread2 = new CounterThread();
		//设置优先级  数字越大，优先级越高
		thread1.setPriority(1);
		thread2.setPriority(10);
		thread1.setName("线程1");
		thread2.setName("线程2");
		thread1.start();
		thread2.start();
	}

}
