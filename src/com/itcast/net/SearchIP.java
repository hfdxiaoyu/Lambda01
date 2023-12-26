package com.itcast.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 通过给定的主机域名查找该主机在internet上的ip地址
 * @author 13069
 *
 */
public class SearchIP {
	public static void main(String[] args) {
		String hostname = "www.baidu.com";
		
		//	InetAddress这个类提供 处理地址和相应主机名的方法
		try {
			//InetAddress.getByName返回给定主机名或点分十进制表示的主机ip地址
			InetAddress address = InetAddress.getByName(hostname);
			System.out.println(address);
			System.out.println("主机名："+address.getHostName());
			System.out.println("IP地址："+address.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println("给定的主机不存在");
			e.printStackTrace();
		}
		
	}
}
