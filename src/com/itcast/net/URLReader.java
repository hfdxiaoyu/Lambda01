package com.itcast.net;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 读取web资源
 * @author 13069
 *
 */
public class URLReader {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.baidu.com");
			//url.openStream()建立一个连接并返回一个InputStream对象
			BufferedReader in = new BufferedReader(
					new InputStreamReader(url.openStream()));
			
			FileWriter out = new FileWriter("index.html");
			String inputLine;
			while ((inputLine=in.readLine()) != null) {
				out.write(inputLine);
			}
			in.close();
			out.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
