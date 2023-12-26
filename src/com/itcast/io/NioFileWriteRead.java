package com.itcast.io;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 小文件的读写
 * @author 13069
 *
 */
public class NioFileWriteRead {
	public static void main(String[] args) {
		//写入文件
		Path textFile = Paths.get("D:\\Study\\java work\\2022java\\Io\\speech.txt");
		//设置字符集
		Charset character = Charset.forName("UTF-8");
		String line1 = "使用java.nio.file.Files类";
		String line2 = "读写文件很容易。";
		List<String> lines = Arrays.asList(line1,line2);
		
		try {
			//写入文件
			//StandardOpenOption.CREATE若文件存在则打开，若文件不存在则创建新文件
			//StandardOpenOption.TRUNCATE_EXISTING 截断文件使其长度为0字节
			Files.write(textFile, lines, StandardOpenOption.CREATE,
					StandardOpenOption.TRUNCATE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<String> linesRead = null;
		try {
			linesRead = Files.readAllLines(textFile,character);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (linesRead != null) {
			linesRead.forEach(System.out::println);
		}
	}
}
