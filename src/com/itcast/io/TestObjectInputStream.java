package com.itcast.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;

/**
 *向ObjectInputStream中写入对象
 * @author 13069
 *
 */
public class TestObjectInputStream {
	public static void main(String[] args) {
		String filePath = "D:\\Study\\java work\\2022java\\Io\\";
		try (
			//文件输入流
			FileInputStream fis = new FileInputStream(filePath+"data.ser");
			//对象输入流
			ObjectInputStream oip = new ObjectInputStream(fis);
		){
			int i = oip.readInt();
			String today = (String)oip.readObject();
			LocalDate date = (LocalDate) oip.readObject();
			System.out.println(i+" "+today+" "+date);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
