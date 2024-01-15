package com.itcast.jdk11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * 标准Java异步HTTP客户端
 */
public class AsyncHttpClient {
    public static void main(String[] args) {
        //创建httpClient
        HttpClient httpClient = HttpClient.newHttpClient();
        //创建 request
        HttpRequest request = HttpRequest.newBuilder(URI.create("http://www.baidu.com")).build();
        try {
            //send同步发送数据，并指定Resopnse的Body如何处理
            HttpResponse<String> response = httpClient.send(request,HttpResponse.BodyHandlers.ofString());
            // 打印headers和body
            System.out.println(response.headers());
            System.out.println(response.body());
            // sendAsync异步发送
            httpClient.sendAsync(request,HttpResponse.BodyHandlers.ofString())
                    .thenApply(HttpResponse::body)
                    .thenAccept(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
