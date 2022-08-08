package com.java.thread;

public class StaticSynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<4;i++) {
	AccHolder t=new AccHolder();
	t.setName("person" +i);
	t.start();
}
	}

}


class ATMCenter{
	static synchronized void userAction() throws InterruptedException{
		System.out.println(Thread.currentThread().getName()+"entered");
		System.out.println("performed transaction");
		try
		{
			Thread.sleep(400);
		}catch(Exception e) {
			System.out.println("thread intrupterd ");

		}
		System.out.println(Thread.currentThread().getName()+"transaction cmpt");
		System.out.println(Thread.currentThread().getName()+"leaving......");

		System.out.println("........................");

	}
}
class AccHolder extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			ATMCenter.userAction();
		}
		catch(InterruptedException e){
		e.printStackTrace();	
		}
	}
}