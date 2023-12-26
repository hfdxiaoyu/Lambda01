package com.itcast.io;

import java.io.File;
import java.io.IOException;

/**
 * File类使用实例
 * @author 13069
 *
 */
public class FileDemo {
	public static void main(String[] args) {
		String filePath = "D:\\Study\\java work\\2022java\\Io\\";
		try {
			File file = new File(filePath+"Hello.txt");
			//exists() 文件是否存在
			System.out.println(file.exists());
			//这个变量用来存储是否创建成功
			boolean success = false;
			//创建文件
			success = file.createNewFile();
			System.out.println(success);
			System.out.println(file.exists()); //输出文件是否创建成功
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
