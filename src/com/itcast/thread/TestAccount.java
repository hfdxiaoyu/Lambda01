package com.itcast.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * 测试account类
 * @author 13069
 *
 */
public class TestAccount {
	public static void main(String[] args) {
		Account account = new Account(1000);
		
		Runnable r1 = ()->{
			for (int i = 0; i < 100; i++) {
				try {
					account.operateAccount(i);
					System.out.println("r1往账户里面开始存钱啦,存钱金额："+i);
					Thread.sleep((int)(Math.random()*100));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			System.out.println("账户总余额："+account.getBalance());
		};
		
		Runnable r2 = ()->{
			for (int i = 0; i < 100; i++) {
				try {
					account.operateAccount(i);
					System.out.println("r2往账户里面开始存钱啦,存钱金额："+i);
					Thread.sleep((int)(Math.random()*100));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block0
					e.printStackTrace();
				}
				
			}
			System.out.println("账户总余额："+account.getBalance());
		};
		
		Executor executor = Executors.newCachedThreadPool();
		executor.execute(r1);
		executor.execute(r2);
		
	}
}
