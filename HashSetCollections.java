package com.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set <String> s=new HashSet<>();
s.add("Ashwini");
s.add("Kalpana");
s.add("sonali");
s.add("priti");
s.add(null);
//s.clear();

System.out.println("element in hashset is"+s);
System.out.println("element in hashset is"+s.isEmpty());
System.out.println("element in hashset is"+s.remove("sonali"));
System.out.println("element in hashset is"+s);

System.out.println(" hashset cantains value is"+s.contains("priti"));
System.out.println(" hashcode is"+s.hashCode());//ascii value add is print
System.out.println("Size of hashset is"+s.size());
HashSet <Integer> s1=new HashSet<>(4,0.50f);
s1.add(6);
s1.add(9);
s1.add(5);
s1.add(4);
s1.add(58);

s1.add(95);
s1.add(52);

s1.add(50);

System.out.println("element in hashset is"+s1);
HashSet <Integer> s2=new HashSet<>();
s2.addAll(s1);
System.out.print("element in hashset is"+s2);




	}

}
