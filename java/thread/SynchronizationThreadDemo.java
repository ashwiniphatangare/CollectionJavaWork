package com.java.thread;
class Factorial extends Thread{
	int factNum=0;
	public Factorial(int fact) {
		this.factNum=fact;
	}
	public void run() {
		int j=findFacto(factNum);
		System.out.println("Factorial is:" +j);
	}
	synchronized public int findFacto(int number) {
		int i,fact=1;
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
class Table extends Thread{
	int num=0;
	public Table(int num) {
		this.num=num;
	}
	public void run() {
		creatTable(num);			
		
	}
	synchronized public void creatTable(int number) {
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
public class SynchronizationThreadDemo {

	public static void main(String[] args) {

Factorial f=new Factorial(3);
Table t=new Table(5);
f.start();

t.start();

	}

}
