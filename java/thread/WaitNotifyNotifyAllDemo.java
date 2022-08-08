package com.java.thread;
class customer{
	int amount=6000;
	synchronized void withdraw(int amount) {
		System.out.println("goig to withdraw");
		if(this.amount<amount) {
			System.out.println("less amount waiting for deposite");
			try {
				wait();
				
			}catch(Exception e){
				
			}
		}
		this.amount -=amount;
		System.out.println("withdraw completed....");
	}
	synchronized void deposite(int amount) {
		System.out.println("going to deposite....");
		this.amount+=amount;
		System.out.println("deposite completed....");
notify();

	}
}

public class WaitNotifyNotifyAllDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final customer c=new customer();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		new Thread() {
				public void run() {
					c.deposite(10000);
				}
				}.start();
			
		}
}

