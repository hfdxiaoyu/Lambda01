package com.itcast.thread;

/**
 * 生产者
 * @author 13069
 *
 */
public class MonitorProducer extends Thread {
	private MonitorBox box; // 被共享的对象
	
	
	public MonitorProducer() {
		super();
	}

	public MonitorProducer(MonitorBox box) {
		super();
		this.box = box;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			box.put(i); //生产一个整数
			System.out.println("Producer " + "put: "+i);
			try {
				//随机休眠
				sleep((int)(Math.random() * 100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
}
