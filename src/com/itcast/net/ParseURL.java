package com.itcast.net;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * URL解析类
 * @author 13069
 *
 */
public class ParseURL {
	public static void main(String[] args) {
		try {
			List<String> s1= new  ArrayList<String>();
			
			URL aUrl = new URL("http://docs.oracle.com/javase/tutorial/index.html?name=networking#DOWNLOADING");
			//返回url的协议名
			System.out.println("protocol = "+aUrl.getProtocol());
			//getAuthority 返回URL的权限信息
			System.out.println("authority = "+aUrl.getAuthority());
			//返回URL的主机名
			System.out.println("host = "+aUrl.getHost());
			//返回URL的端口号
			System.out.println("port = "+aUrl.getPort());
			//返回URL路径
			System.out.println("path = "+aUrl.getPath());
			//
			System.out.println("query = "+aUrl.getQuery());
			
			System.out.println("file = "+aUrl.getFile());
			System.out.println("ref = "+aUrl.getRef());
			
		} catch (MalformedURLException e) {
			// TODO: handle exception
			System.out.println("URL不合法");
		}
	}
}
