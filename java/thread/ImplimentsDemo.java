









package com.java.thread;

import java.util.Scanner;

class ThreadDemo implements Runnable {
	public void run() {
		int fact=1;
		int num=5;
		
		
				for(int i=1;i<=num;i++) {
					fact=fact*i;
				}
				System.out.println("fact is"+fact);
	}
}
class ThreadDemo2 implements Runnable {
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
class ThreadDemo3 implements Runnable {
	public void run() {
	
		int num=5;
		for(int i=1;i<=10;i++) {
			System.out.println(+num+"*"+i+" = "+num*i+"");	
			}
	}
}
public class ImplimentsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo t1=new ThreadDemo();
		Thread t=new Thread(t1);
		t.start();
		ThreadDemo2 t2=new ThreadDemo2();
		Thread th=new Thread(t2);
		th.start();
		ThreadDemo3 t3=new ThreadDemo3();

		Thread th1=new Thread(t3);
		th1.start();
		
//		Thread t=new Thread(t2);
//		t.start();
//		Threadeg3 t3=new Threadeg3();
//		t3.start();
	}

}
