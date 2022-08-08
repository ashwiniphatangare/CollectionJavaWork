package com.collection;

import java.util.HashMap;

public class HashMapcollection {

	public static void main(String[] args) {
HashMap<String,Integer> hm=new HashMap<>();
hm.put("pink", 1);
hm.put("yellow", 8);
hm.put("yel", 2);

hm.put("green", 7);
hm.put("black", 3);
//hm.put("sel", 2);
System.out.println("element in hashmap is" +hm);
System.out.println("element in hashmap is" +hm.putIfAbsent("yel", 4));
System.out.println("keys in hashmap is" +hm.keySet());
System.out.println("values in hashmap is" +hm.values());
System.out.println("element using replace method in hashmap is" +hm.replace("pink", 6));
System.out.println("element in hashmap is" +hm);
System.out.println("cantaint key hashmap is" +hm.containsKey("black"));//true if this is in hashmap
System.out.println(hm.entrySet());
System.out.println(hm.get("black"));//get value

	}

}
