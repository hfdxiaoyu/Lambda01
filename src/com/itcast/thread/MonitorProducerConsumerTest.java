package com.itcast.thread;

/**
 * 生产者对象测试方法
 * 使用监视器模型
 * @author 13069
 *
 */
public class MonitorProducerConsumerTest {
	public static void main(String[] args) {
		MonitorBox box = new MonitorBox(); 
		MonitorProducer p1 = new MonitorProducer(box); //将box对象传递给生产者
		MonitorConsumer c1 = new MonitorConsumer(box); //将box对象传递给消费者
		p1.start();
		c1.start();
		
	}
}
