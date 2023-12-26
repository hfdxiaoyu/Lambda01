package com.itcast.la;

import java.util.Arrays;
import java.util.Comparator;


/*
 * 老版本写法
 */
public class Oldwrite {
	public static void main(String[] args) {
		String []names = {"peter","anna","mike","john"};
		Arrays.sort(names,new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				// TODO Auto-generated method stub
				return b.compareTo(a);
			}
		});
	}
}
