package com.itcast.la;

import java.util.Arrays;

/*
 * Lambda写法
 */
public class LmaWrite {
	public static void main(String[] args) {
		String []names = {"peter","anna","mike","john"};
//		Arrays.sort(names,(String a,String b)->{
//			return b.compareTo(a);
//			});
		
		//也可以去掉大括号
		Arrays.sort(names,(String a,String b)->b.compareTo(a));
		
		callClick(new OnClick() {
			
			@Override
			public void onClick(String s, Integer i) {
				// TODO Auto-generated method stub
				
			}
		});
		
		OnClick listener = (string,i)->{
			
		};
		
		callClick((s,i)->{
			
		});
		callClick(listener);
		
		callPrint(System.out::println);
		callPrint(LmaWrite::p);
	}
	
	public static void callClick(OnClick listener) {
		
	}
	
	public static void callPrint(OnPrint listener) {
		
	}
	
	public static void p(Object o) {
		
	}
}


interface OnClick{
	void onClick(String s,Integer i);
}

interface OnPrint {
	void myPrint(Object obj);
}
