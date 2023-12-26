package com.itcast.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

/**
 * servlet在 JspCrud 下面
 * @author 13069
 *
 */
public class ReverseString {
	public static void main(String[] args) throws Exception {
		//服务器资源url，是一个servlet程序
		URL url = new URL("");
		String stringToReverse = "HELLO";
		URLConnection connection = url.openConnection();
		connection.setDoOutput(true); //设置连接对象作为输出对象使用
		//创建流输出对象
		OutputStreamWriter out = new OutputStreamWriter(
				connection.getOutputStream()
				);
		//向服务器发送字符串
		out.write("string=" + stringToReverse);
		out.close();
		//创建输入流读取返回的字符串
		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		//从服务器读取反转后的字符串
		String decodeString ;
		while ((decodeString = in.readLine()) != null) {
			System.out.println(decodeString);
		}
		in.close();
	}
}
