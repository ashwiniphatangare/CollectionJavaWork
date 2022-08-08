package com.collection;

import java.util.Collections;
import java.util.Vector;

public class VectorCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<String> v=new Vector<>();
v.add("ash");
v.add(0, "nishigandha");
v.addElement("mira");
System.out.println("vector element is: "+v);
System.out.println("vector last element is: "+v.lastElement());
System.out.println("vector get element is: "+v.get(1));
System.out.println("vector set element is: "+v.set(2, "abc"));

System.out.println("vector capacity is: "+v.capacity());
Collections.sort(v);
System.out.println("vector sorting is: "+ v);
System.out.println("vector indexing is: "+ v.indexOf("nishigandha"));
System.out.println("vector indexing is: "+ v.lastIndexOf("nishigandha"));

System.out.println("vector element is: "+v);

	}

}
