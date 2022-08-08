package com.collection;

import java.util.Hashtable;

public class HashtableCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable <String,Integer> ht1=new Hashtable <String,Integer>();
		Hashtable <String,Integer> ht2=new Hashtable <String,Integer>();
		ht1.put("Ashwini", 1);
		ht1.put("neha", 4);
		ht1.put("shita", 3);
		ht1.put("nishi", 10);
		System.out.println("hashtable element" +ht1);
		System.out.println(ht1.contains(3));
		System.out.println(ht1.containsKey("shita"));
		System.out.println(ht1.entrySet());
		System.out.println(ht1.containsValue(3));
		


		

	}

}
