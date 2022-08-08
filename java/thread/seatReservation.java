package com.java.thread;
class First{
	synchronized public void display(String msg) {
		System.out.print("["+msg);
//		try {
//			Thread.sleep(400);
//		}catch(InterruptedException e) {
//			
//			System.out.println(e);
//		}
		System.out.print("]");


	}
}
class Second extends Thread{
	String msg;
	First obj;
	Second(First f,String str){
		obj=f;
		msg=str;
				
	}
	public void run() {
		obj.display(msg);
	}
	
}
public class seatReservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
First f=new First();
Second ss=new Second(f,"welcome");
ss.start();
Second ss1=new Second(f,"to");
ss1.start();
Second ss2=new Second(f,"edu");
ss2.start();

	}

}
