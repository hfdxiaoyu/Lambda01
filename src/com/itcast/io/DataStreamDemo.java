package com.itcast.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲输入输出流
 * @author 13069
 *
 */
public class DataStreamDemo {
	public static void main(String[] args) {
		String filePath = "D:\\Study\\java work\\2022java\\Io\\";
		//向文件中写数据
		//try-with-resources语句，它将自动关闭打开的资源（文件输入输出流）
		try (
				FileOutputStream output = new FileOutputStream(filePath+"data.bat");
				DataOutputStream dataOutputStream = new DataOutputStream(
						new BufferedOutputStream(output));)
		{
			//writeDouble()向输出流写一个8字节的double型浮点数
			dataOutputStream.writeDouble(123.456);
			//writeInt()向输出流写一个4字节的整数
			dataOutputStream.writeInt(100);
			//writeUTF()将输出以UTF8的格式写出到 输出流中
			dataOutputStream.writeUTF("Java语言");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		//从文件中读取数据
		try (
				FileInputStream input = new FileInputStream(filePath+"data.bat");
				DataInputStream dataInStream = new DataInputStream(
						new BufferedInputStream(input)
						)
						
				){
			
			while (dataInStream.available() > 0) {
				double b = dataInStream.readDouble();
				int i = dataInStream.readInt();
				String s = dataInStream.readUTF();
				System.out.println("b = " + b);
				System.out.println("i = " + i);
				System.out.println("s = " + s);
			}
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}	
		
	}
}
