package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<>();
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(8);
		s.push(2);
		s.push(2);
	s.pop();
		System.out.println("element in stack is"+s);
		System.out.println("element to serach is"+s.search(2)); ///return position of element from dwnwrd
		System.out.println("element  is empty or not"+s.empty());
		s.add(5);
		System.out.println("element in stack is"+s);
s.peek();
System.out.println("element in stack is"+s.peek());//return last ele
s.addElement(10);
System.out.println("element in stack is"+s);//add and addElement both are same
s.size();
System.out.println("element in stack is"+s.size());
System.out.println("index of element in stack is"+s.indexOf(3));
System.out.println("last index element in stack is"+s.lastIndexOf(2));

	}

}
