package com.itcast.net;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.CharBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 响应多个客户端服务器
 * @author 13069
 *
 */
public class MultiServer {
	public static void main(String[] args) throws IOException {
		int clientNo = 1;
		ServerSocket serverSocket = new ServerSocket(8088);
		//创建线程执行器
		ExecutorService executor = Executors.newCachedThreadPool();
		try {
			
			System.out.println("服务器程序启动，开始接收客户端请求");
			while (true) {
				//开启监听
				Socket socket = serverSocket.accept();
				InetAddress clInetAddress = socket.getInetAddress();
				System.out.println("客户 "+clientNo+" 的主机名是 "+clInetAddress.getHostName());
				System.out.println("客户 "+clientNo+" 的IP地址是 "+clInetAddress.getHostAddress());
				//将任务添加到执行器中
				executor.execute(new ComputeArea(socket,clientNo));
				clientNo++;
			}
		} finally {
			//关闭连接
			serverSocket.close();
		}
	}
}

//计算圆面积的任务类
//使用实现Runnable接口的方式实现多线程
class ComputeArea implements Runnable{
	private Socket socket;
	private int clientNo;
	
	
	public ComputeArea() {
		super();
	}

	public ComputeArea(Socket socket, int clientNo) {
		super();
		this.socket = socket;
		this.clientNo = clientNo;
	}

	@Override
	public void run() {
		try {
			//输入流
			DataInputStream isFormClient = new DataInputStream(
					//获得套接字上绑定的数据输入流
					socket.getInputStream());
			//输出流
			DataOutputStream osToClient = new DataOutputStream(
					socket.getOutputStream());
			while (true) {
				double radius = isFormClient.readDouble();
				System.out.println("客户端接收的半径值："+radius);
				double area = radius * radius *Math.PI;
				osToClient.writeDouble(area);
				//刷新流
				osToClient.flush();
				System.out.println("面积是："+area);
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println(e);
		}
	}


	
}
