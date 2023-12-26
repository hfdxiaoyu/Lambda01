package com.itcast.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Nio创建缓存流
 * @author 13069
 *
 */
public class NioTextWriteRead {
	public static void main(String[] args) {
		Path path = Paths.get("article.txt");
		System.out.println(path.toAbsolutePath());
		Charset charset = Charset.forName("GB2312");
		char[] chars = {'\u4F60','\u597D',',','中','国'};
		try (
			BufferedWriter output = Files.newBufferedWriter(path, charset);)
		{
			//将字符数组写入文件
			output.write(chars);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//从文件中读出数据
		try (
			BufferedReader input = Files.newBufferedReader(path,charset)	)
		{
			String line = input.readLine();
			while (line != null) {
				System.out.println(line);
				line = input.readLine();
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
