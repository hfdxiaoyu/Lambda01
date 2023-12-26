package com.itcast.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.security.auth.DestroyFailedException;

/**
 * Nio File 对象，该类定义了大量的静态方法来读、写操纵文件与目录
 * @author 13069
 *
 */
public class NioFileDemo {
	public static void main(String[] args) {
		//声明一个路径
		Path path = Paths.get("D:\\Study\\java work\\2022java\\Io");
		//声明一个文件对象
		Path file = Paths.get("D:\\Study\\java work\\2022java\\Io\\report.txt");
		try {
			//判断目录是否存在，不存在则创建目录
			if (!Files.exists(path)) {
				//创建路径
				path = Files.createDirectory(path);
			}
			//判断文件是否存在，不存在则创建文件
			if (!Files.exists(file)) {
				//创建文件
				file = Files.createFile(file);
			}
			
		} catch (FileAlreadyExistsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}  catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(Files.exists(path));
		//isReadable 检查path所指定的文件或目录是否可读
		System.out.println(Files.isReadable(file));
		
		try {
			//删除目录
			Files.delete(path);
		} catch (NoSuchFileException e) {
			// TODO Auto-generated catch block
			System.err.println("没有 这个目录 ："+path);
		} catch (DirectoryNotEmptyException e) {
			System.err.println("此文件夹非空");
		} catch (IOException e) {
			// 文件许可问题在此捕获
			System.err.println(e);
		}
	}
}
