package com.itcast.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 文本I/O流
 * @author 13069
 *
 */
public class FileCopyDemo {
	public static void main(String[] args) {
		String filePath = "D:\\Study\\java work\\2022java\\Io\\";
		
		File inputFile = new File(filePath+"input.txt");
		File outputFile = new File(filePath+"output.txt");
		try (
			//文件输入流
			FileReader in = new FileReader(inputFile);
			//文件输出流
			FileWriter out = new FileWriter(outputFile);
		){
			//读取
			int c = in.read();
			//读取input.txt的内容写入到output.txt中
			while (c != -1) {
				out.write(c);
				c = in .read();
			}
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
	}
}
