package com.itcast.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 简单的字符界面聊天程序
 * 服务端
 * @author 13069
 *
 */
public class ServerDemo {
	public static void main(String[] args) {
		try (
				ServerSocket server = new ServerSocket(8080);
				//开启监听
				Socket socket = server.accept();
				//缓冲字符输入流
				BufferedReader is = new BufferedReader(
						//InputStreamReader二进制输入流
						new InputStreamReader(socket.getInputStream())
						);
				//PrintWriter类实现字符打印输出流
				PrintWriter os = new PrintWriter(socket.getOutputStream());
				
				Scanner input = new Scanner(System.in);
			){
				//显示从客户端读的数据
				System.out.println("客户端："+is.readLine()); 
				System.out.print("服务端：");
				//从键盘读取一行
				String line = input.nextLine();
				while (!line.equals("bye")) {
					os.println(line); //将数据发送到客户端
					os.flush();
					//显示从客户端读的数据
					System.out.println("客户端："+is.readLine());
					System.out.print("服务端：");
					//从键盘读取一行数据
					line = input.nextLine();
				}
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
