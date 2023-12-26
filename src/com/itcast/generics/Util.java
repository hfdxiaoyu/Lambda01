package com.itcast.generics;

//泛型方法
public class Util {
	
	//交换任何数组中的两个元素
	public static <T> void swap(T[] array,int i,int j) {
		T temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	//比较两个泛型类PaIr对象的参数K，V是否相等
	public static <K,V> boolean compare(Pair<K, V> p1,Pair<K, V> P2) {
		return p1.getValue().equals(P2.getKey()) && p1.getValue().equals(P2.getValue());
	}
	public static void main(String[] args) {
		Integer[] numbers = {1,3,5,7};
		Util.<Integer>swap(numbers, 0, 3);
		for (Integer n : numbers) {
			System.out.print(n + " ");
		}
		
		Pair<Integer, String> p1 = new Pair<Integer, String>(1,"apple");
		Pair<Integer, String> p2 = new Pair<Integer, String>(2,"orange");
		//调用泛型方法
		boolean same = Util.<Integer, String>compare(p1,p2);
		System.out.println(same);
	}
}
