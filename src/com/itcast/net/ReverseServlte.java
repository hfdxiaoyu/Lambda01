//package com.itcast.net;
//
//import java.io.IOException;
//import java.io.OutputStreamWriter;
//import java.net.URLDecoder;
//
//import javax.servlet.ServletException;
//import javax.servlet.ServletInputStream;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * Servlet implementation class ReverseServlte
// * ReverseString的servlet
// */
//@WebServlet("/reverseServlte")
//public class ReverseServlte extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//    private static String message = "servlet 处理错误";
//
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public ReverseServlte() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		try {
//			int len = request.getContentLength();
//			byte[] input = new byte[len];
//			ServletInputStream sin = request.getInputStream();
//			int c, count = 0;
//			while((c = sin.read(input,count,input.length-count)) != -1) {
//				count += c;
//			}
//			sin.close();
//			String inString = new String(input);
//			int index = inString.indexOf("=");
//			if (index == -1) {
//				response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
//				response.getWriter().print(message);
//				response.getWriter().close();
//				return;
//			}
//			String value = inString.substring(index+1);
//			//将application/x-www-form-urlencode 字符串解码成UTF-8格式
//			String decodedString = URLDecoder.decode(value,"UTF-8");
//
//			//反转字符串
//			String reverseStr = (new StringBuffer(decodedString)).reverse().toString();
//			response.setStatus(HttpServletResponse.SC_OK);
//			OutputStreamWriter writer = new OutputStreamWriter(response.getOutputStream());
//			writer.write(reverseStr);
//			writer.flush();
//			writer.close();
//
//		} catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
//			response.getWriter().print(e.getMessage());
//			response.getWriter().close();;
//		}
//
//
//		doGet(request, response);
//	}
//
//}
