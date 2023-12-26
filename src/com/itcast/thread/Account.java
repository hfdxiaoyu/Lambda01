package com.itcast.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用Lock锁定对象
 * @author 13069
 *
 */
public class Account {
	private final Lock bankLock = new ReentrantLock();
	private double balance;
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	
	public void operateAccount(double savings) throws InterruptedException {
		bankLock.lock(); //开始加锁
		try {
			double amount = balance + savings;
			Thread.sleep(100);
			balance = amount;
		} finally {
			bankLock.unlock(); //释放锁
		}
		
	}
	
}
