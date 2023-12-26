package com.itcast.io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 实现Customer类的序列化跟反序列化
 * @author 13069
 *
 */
public class ObjectSerializeDemo {
	public static void main(String[] args) {
		String filePath = "D:\\Study\\java work\\2022java\\Io\\";
		Customer customer = new Customer(101, "刘明", "北京市海淀区");
		LocalDate today = LocalDate.now();
		
		//序列化
		try (
				//输出流
				OutputStream output = new FileOutputStream(filePath+"customer.dat");
				//对象输出流
				ObjectOutputStream oos = new ObjectOutputStream(output);
				
			){
				//写入
				oos.writeObject(customer);
				oos.writeObject(today);
				oos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//反序列化
		try (
				InputStream input = new FileInputStream(filePath+"customer.dat");
				ObjectInputStream ois = new ObjectInputStream(input);
			){
				while (true) {
					try {
						customer = (Customer) ois.readObject();
						System.out.println(customer.toString());
						today = (LocalDate) ois.readObject();
						System.out.println("日期："+today);
						
					} catch (EOFException e) {
						// TODO: handle exception
						break;
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}

class Customer implements Serializable{
	public int id;
	public String name;
	public String address;
	
	public Customer(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}