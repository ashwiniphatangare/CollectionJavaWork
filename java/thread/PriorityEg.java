package com.java.thread;
class X implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread X is Started");
		for(int i=1;i<=4;i++) {
			System.out.println("Thread X:" +i);
		}
		System.out.println("Exit from Thread X:");

	}
	
}
class Y implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Y is Started");
		for(int i=1;i<=4;i++) {
			System.out.println("Thread Y:" +i);
		}
		System.out.println("Exit from Thread Y:");

	}
	
}
class Z implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Z is Started");
		for(int i=1;i<=4;i++) {
			System.out.println("Thread Z:" +i);
		}
		System.out.println("Exit from Thread Z:");

	}
	
}
public class PriorityEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x=new X();
		Y y=new Y();
		Z z=new Z();
		Thread t1=new Thread(x);
		Thread t2=new Thread(y);
		Thread t3=new Thread(z);
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(t2.getPriority()+4);//by defaut  prioprity 5 set
		t3.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		

	}

}
