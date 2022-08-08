package com.java.thread;

public class GarbageCollectionDemo implements Runnable {
	private void getMyMethod() throws InterruptedException {
		try {
			System.out.println("hi,try");
throw new NullPointerException();
		}
		catch(NullPointerException e){
			System.out.println("hi,catch");
		}
		finally{
			System.out.println("hi,finnally");
System.gc();
		}
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("object in garbage collector");
		super.finalize();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			getMyMethod();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			new Thread(new GarbageCollectionDemo()).start();
		}
		
		

	}
	
	

}
