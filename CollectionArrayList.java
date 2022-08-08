package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionArrayList {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
List <String>li=new ArrayList<>();
li.add("Ashwini");
li.add("Chitra");
li.add(null);
li.add("Nishi");
li.add("Shital");

System.out.println("list of element"+li);
System.out.println("length of list"+li.size());
System.out.println("get of list"+li.get(2));
System.out.println("set value to the list"+li.set(3,"payal"));
System.out.println("list of element"+li);
System.out.println("remove the  element"+li.remove(2));
System.out.println("list of element"+li);
li.add("Shital");
System.out.println("remove the  element"+li.remove(3));
li.add("Shital");
System.out.println("cantaint of element"+li.contains("nikita"));
String[] arr=li.toArray(new String[0]);
for(String x:arr)
System.out.print(x+" ");
System.out.println("Iterator is");
Iterator itr=li.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}




	}

}
