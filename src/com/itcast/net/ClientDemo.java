package com.itcast.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 简单聊天程序，客户端
 * @author 13069
 *
 */
public class ClientDemo {
	public static void main(String[] args) {
		try (
			Socket socket = new Socket("127.0.0.1",8080);
			BufferedReader is = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			PrintWriter os = new PrintWriter(socket.getOutputStream());	
			Scanner scanner = new Scanner(System.in);
			
		){
			System.out.print("客户端：");
			String line = scanner.nextLine();
			while (!line.equals("bye")) {
				//将数据发送到服务器
				os.println(line);
				os.flush();
				System.out.println("服务器端："+is.readLine());
				System.out.print("客户端：");
				line = scanner.nextLine();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
