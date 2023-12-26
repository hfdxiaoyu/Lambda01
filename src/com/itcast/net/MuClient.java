package com.itcast.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


public class MuClient {
	public static void main(String[] args) {
		try (
			Socket socket = new Socket("localhost",8088);
			DataInputStream isFormServer = new DataInputStream(
					socket.getInputStream());
			DataOutputStream osToServer = new DataOutputStream(
					socket.getOutputStream());
			Scanner input = new Scanner(System.in);
				){
			while (true) {
				System.out.println("请输入圆半径：");
				double radius = input.nextDouble();
				osToServer.writeDouble(radius);
				osToServer.flush();
				double area = isFormServer.readDouble();
				System.out.println("圆的面积是："+area);
			}
			
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println(e);
		}
	}
}
