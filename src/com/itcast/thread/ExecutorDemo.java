package com.itcast.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * 使用线程执行器对象运行线程
 * @author 13069
 *
 */
public class ExecutorDemo {
	public static void main(String[] args) {
		Runnable hellos = ()->{
			for (int i = 0; i <= 100; i++) {
				System.out.println("hello "+i);
			}
		};
		
		Runnable goodbye = ()->{
			for (int i = 0; i <= 100; i++) {
				System.out.println("goodbye "+i);
			}
		};
		
		//创建线程池对象
		//Executors.newCachedThreadPool() 通过缓存池管理线程，当提交的任务越来越多时，
		//Executor就会创建更多的线程以执行任务
		Executor executor = Executors.newCachedThreadPool();
		executor.execute(hellos);
		executor.execute(goodbye);
	}
}
