package com.collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> s = new TreeSet<>();
		s.add("Ashwini");
		s.add("Kalpana");
		s.add("sonali");
		s.add("priti");

		System.out.println("element in TreeSet is" + s);
	}

}
//treeset follow follow asc but hashset print random
//null not accepted in treeset
//hashset is fast and treeset is slow beacause it take time to convert ascending
//treeset uses campareTo and hashset us Equal