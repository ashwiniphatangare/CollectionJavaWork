package com.java.thread;
class Factorial1 extends Thread{
	int factNum=0;
	public Factorial1(int fact) {
		this.factNum=fact;
	}
	public void run() {
		int j=findFacto(factNum);
		System.out.println("Factorial is:" +j);
	}
	 public int findFacto(int number) {
		 synchronized(this){		int i,fact=1;
		for(i=1;i<=number;i++) {
			fact=fact*i;
			try {
				Thread.sleep(400);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		return fact;
	}
	 }
}
class Table1 extends Thread{
	int num=0;
	public Table1(int num) {
		this.num=num;
	}
	public void run() {
		creatTable(num);			
		
	}
	 public void creatTable(int number) {
		 synchronized(this) {
		System.out.println("\n\n Table is:");
		for(int i=1;i<=10;i++) {
			System.out.println(number+"*"+i+"="+(number*i));
			try {
				Thread.sleep(400);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		}
	}
}
public class SynchronizationBlockDEmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial1 f=new Factorial1(3);
		Table1 t=new Table1(5);
		f.start();

		t.start();

	}

}
