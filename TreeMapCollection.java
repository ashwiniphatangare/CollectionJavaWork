package com.collection;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap <Integer,String> tm=new TreeMap<>();
tm.put(1, "ash");
tm.put(2, "monu");
//tm.put(2, "monu");
tm.put(8, "tonu");

System.out.println("element treemap: " +tm);
System.out.println("sorting"+tm.descendingKeySet());
//System.out.println("sorting"+tm.ceilingKey(8));
System.out.println("descendingMap sorting"+tm.descendingMap());



	}

}
