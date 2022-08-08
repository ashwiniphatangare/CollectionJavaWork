package com.java.thread;



import java.util.Scanner;

class P implements Runnable {
	 int num;

	public void run() {
		int fact=1;
		int num=5;
		
		
				for(int i=1;i<=num;i++) {
					fact=fact*i;
				}
				System.out.println("fact is"+fact);
	}

	public synchronized void setNum(int num) {
		// TODO Auto-generated method stub
		this.num=num;
		
	}

	public void setPriority() {
		// TODO Auto-generated method stub
		
	}
}
class Q implements Runnable {
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
class R implements Runnable {
	public void run() {
	
		int num=5;
		for(int i=1;i<=10;i++) {
			System.out.println(+num+"*"+i+" = "+num*i+"");	
			}
	}
}
public class ThreadPriorityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to perform");
		int num=sc.nextInt();
		P t1=new P();
		t1.setNum(6);
		
		Thread t=new Thread(t1);
		t.start();
		t1.setPriority();
		Q t2=new Q();
		Thread th=new Thread(t2);
		th.start();
		R t3=new R();

		Thread th1=new Thread(t3);
		th1.start();
		

	}

}



