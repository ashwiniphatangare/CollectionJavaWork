package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> hset=new HashSet<>();
		hset.add("Ashwini");
		hset.add("Kalpana");
		hset.add("sonali");
		hset.add("priti");
		hset.add(null);
		//s.clear();

		System.out.println("element in hashset is"+hset);
		List <String> list=new ArrayList<>(hset);
		System.out.println("hashset to arraylist conversion: "+ list);//yes u can convert


	}

}
