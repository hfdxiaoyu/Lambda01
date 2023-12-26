package com.itcast.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 并发工具
 * 原子变量
 * 原子操作无需使用synchronized关键字修饰
 * @author 13069
 *
 */
public class AtomicCounter {
	
	AtomicInteger count = new AtomicInteger(0);
	
	public void increment() {
		//getAndIncrement()先返回当前值，再自增1
		count.getAndIncrement();
	}
	private void decrement() {
		//先自增1再返回值
		count.decrementAndGet();
	}
	public int getCount() {
		return count.get();
	}
	
	
}
