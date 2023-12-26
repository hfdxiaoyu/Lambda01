package com.itcast.thread;

/**
 * 消费者
 * @author 13069
 *
 */
public class MonitorConsumer extends Thread {
	private MonitorBox box;
	
	public MonitorConsumer(MonitorBox box) {
		super();
		this.box = box;
	}
	

	@Override
	public void run() {
		int value = 0;
		for (int i = 0; i < 10; i++) {
			value = box.get();
			System.out.println("Consumer "+" got: "+ value);
			//随机休眠
			try {
				sleep((int)(Math.random() * 100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
