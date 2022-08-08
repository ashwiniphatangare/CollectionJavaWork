package com.java.thread;

public class gcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gcDemo s=new gcDemo();
		String s1=new String("hellow");
		s=null;
		s1=null;
		System.gc();
		System.out.println("i am main method");
	}
	@Override
	protected void finalize() {
		System.out.println("i am finalize method");

	}

}
