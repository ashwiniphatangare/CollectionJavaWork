package com.collection;

import java.util.EnumSet;
import java.util.Iterator;

enum Color{
	 red,pink,blue,green,white,black;
}
public class EnumSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumSet <Color> c=EnumSet.allOf(Color.class);  //print empty set beacause of noneof
		System.out.println("Empty EnumSet:" +c);
		EnumSet<Color> c1=EnumSet.range(Color.green, Color.black);
		System.out.println("range of EnumSet:" +c1);
//		c1.add(Color.valueOf("Violet"));
		Iterator<Color> itr=c.iterator();
		System.out.println("ele of EnumSet:" +c1);
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//c.add(Color.blue);
		
		EnumSet <Color> c3=EnumSet.noneOf(Color.class);  //print empty set beacause of noneof
		EnumSet <Color> c4=EnumSet.allOf(Color.class);  //print empty set beacause of noneof

		c3.add(Color.black);
		c3.add(Color.white);
	System.out.println("ele of EnumSet:" +c3);

	}

}
