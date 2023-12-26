package com.itcast.ex;

import java.util.HashMap;
import java.util.Map;

public class LetterCount {
	public static void main(String[] args) {
		String s1 = "VniudAjw nclkwnce nwvc";
		int a2=1;
		Map<String, Integer> map1 = new HashMap<>();
		String s2 = s1.replace(" ", "");
		System.out.println(s2);
		for (int i = 0; i < s2.length(); i++) {
			for (String key1 : map1.keySet()) {
				if (key1.equals(Character.toString(s2.charAt(i)))) {
					System.out.println(key1+s2.charAt(i));
					String a1 = Character.toString(s2.charAt(i));
					a2++;
					map1.put(a1, a2);
				}else {
					String a1 = Character.toString(s2.charAt(i));
					map1.put(a1, 1);
				}
			}
			
		}
		
		System.out.println(map1.get("V"));
	}
}
