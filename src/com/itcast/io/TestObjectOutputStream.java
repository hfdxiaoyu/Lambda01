package com.itcast.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

/**
 * 对象序列化与对象流
 * 向ObjectOutputStream中写入对象
 * @author 13069
 *
 */
public class TestObjectOutputStream {
	public static void main(String[] args) {
		String filePath = "D:\\Study\\java work\\2022java\\Io\\";
		
		try {
			//文件输出流
			FileOutputStream fos = new FileOutputStream(filePath+"data.ser");
			//对象输出流
			ObjectOutputStream oop = new ObjectOutputStream(fos);
			oop.writeInt(2022);
			oop.writeObject("你好");
			oop.writeObject(LocalDate.now());
			//刷新缓存
			oop.flush();
			oop.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
