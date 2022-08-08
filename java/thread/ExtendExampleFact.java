package com.java.thread;

import java.util.Scanner;

class Threadeg extends Thread {
	public void run() {
		int fact=1;
		int num=5;
		
		
				for(int i=1;i<=num;i++) {
					fact=fact*i;
				}
				System.out.println("fact is"+fact);
	}
}
class Threadeg2 extends Thread {
	public void run() {
		 int n1=0,n3;
		 int n2=1;
//		 Scanner sc=new Scanner(System.in);
//			System.out.println("enter number");
//					int num=sc.nextInt();
					System.out.print("fibbonaci series"+n1+""+n2);
		 for(int i=2;i<=10;i++) {
			n3=n1+n2;
			System.out.print(n3);
			n1=n2;
			n2=n3;
		 }
	}
}
class Threadeg3 extends Thread {
	public void run() {
	
		int num=5;
		for(int i=1;i<=10;i++) {
			System.out.println(+num+"*"+i+" = "+num*i+"");	
			}
	}
}
public class ExtendExampleFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadeg t1=new Threadeg();
		t1.start();
		Threadeg2 t2=new Threadeg2();
		t2.start();
		Threadeg3 t3=new Threadeg3();
		t3.start();
	}

}
