package com.itcast.generics;

public class Pair<K,V> implements Entry<K, V> {
	private K key;
	private V value;
	
	
	
	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	
	public void setKey(K key) {
		this.key = key;
	}


	public void setValue(V value) {
		this.value = value;
	}



	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(20, "twenty");
		Pair<String, String> p2 = new Pair<>("china", "Beijing");
		System.out.println(p1.key);
		System.out.println(p2.key);
	}
	
}
