package com.itcast.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputInputDemo {
	public static void main(String[] args) {
		final String filePath = "D:\\Study\\java work\\2022java\\Io\\";
		//创建文件对象
		File outputFile = new File(filePath+"output.bat"); 
		try {
			//向文件中写入数据
			FileOutputStream out = new FileOutputStream(outputFile);
		
		for (int i = 0; i < 10; i++) {
			int x = (int)(Math.random()*90) + 10;
			//只把整数低八位写入输出
			out.write(x);
		}
		//刷新输出流
		out.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		//从文件中提取数据
		File inputFile = new File(filePath+"output.bat");
		
		try {
			FileInputStream in = new FileInputStream(inputFile);
			//读取数据
			int c = in.read();
			while (c != -1) {
				System.out.print(c + " ");
				c = in.read(); 
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
