package com.itcast.ex;

public class Two {
		public static int comp(int a, int b) {
			if (a == b)
				System.out.println("a==b");
			return a >= b ? a : b;
		}
	 
		public static int sumTopN(int[] arr) {
			if (arr.length == 0)
				return -1;
			if (arr.length == 1)
				return arr[0];
			if (arr.length == 2)
				return comp(arr[0], arr[1]);
			int a = arr[0];
			int b = comp(arr[0], arr[1]);
			int c = 0;
			for (int i = 2; i < arr.length; i++) {
				c = comp(a + arr[i], b);
				a = b;
				b = c;
			}
			System.out.println("c= " + c);
			return c;
		}
	 
		public static void main(String[] args) {
			int[] arr = {2,4,10,5,8,9,3};
			int x = sumTopN(arr);
			System.out.println("x= " + x);
			
		}
	 
}
