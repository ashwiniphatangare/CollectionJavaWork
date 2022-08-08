package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> li=new LinkedList<>();

		li.add("Shubhangi");
		li.add("sharda");
		li.addFirst("Shital");
		//li.addLast("parul");
		li.add("sharad");
		li.add("sharadaa");
		li.add("abhina");


System.out.println("print first element"+li.peek());
System.out.println("remove first element is"+li.poll());
System.out.println("element is"+li);
System.out.println("remove last ele"+li.remove());
System.out.println("element is"+li);
Iterator itr= li.descendingIterator();
System.out.println("descending " );

while(itr.hasNext()) {
	System.out.println("value " +itr.next());
}

	
		
  
	}

	

}
