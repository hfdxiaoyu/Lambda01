package com.itcast.thread;

/**
 * 生产者对象测试方法
 * 错误示例测试
 * @author 13069
 *
 */
public class ProducerConsumerTest {
	public static void main(String[] args) {
		Box box = new Box(); 
		Producer p1 = new Producer(box); //将box对象传递给生产者
		Consumer c1 = new Consumer(box); //将box对象传递给消费者
		p1.start();
		c1.start();
		
	}
}
