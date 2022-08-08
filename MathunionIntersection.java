package com.collection;

import java.util.HashSet;
import java.util.Set;

public class MathunionIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Integer> h=new HashSet<>();
		HashSet <Integer> h1=new HashSet<>();
		h.add(3);
		h.add(2);
		h.add(6);
		h.add(1);
		h1.add(3);
		h1.add(2);
		h1.add(4);
		System.out.println("Intersection hashset is"+h1.retainAll(h));
		System.out.println("is all same element in two hashset is"+h1.containsAll(h));
		System.out.println("Union hashset is"+h1.addAll(h));

		System.out.println("differance bet hashset is"+h.removeAll(h1));
		System.out.println("element hashset is"+h1);

	}

}
