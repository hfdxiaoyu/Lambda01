package com.itcast.io;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * nio读取大文件
 */
public class NioReadBigFile {
    public static void main(String[] args) {
        Path path = Paths.get("D:/czd/video/image/20240103/CS.txt");
        try (
                //打开一个文件通道,设置读取模式
                FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ);
        ) {
            //创建一个缓冲区
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            while (fileChannel.read(buffer) > 0){
                buffer.flip(); //设置为读模式
                buffer.clear();
                System.out.println(new String(buffer.array()));
            }


        } catch (IOException e) {

        }

    }

}
