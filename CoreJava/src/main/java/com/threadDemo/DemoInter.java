package com.threadDemo;

public class DemoInter implements Runnable{
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("I am in thered>>>>"+i+"   "+Thread.currentThread());
		}
	}
	
	
	public static void main(String[] args) {
		DemoInter i  = new DemoInter();
		Thread t = new Thread(i);
		Thread t2 = new Thread(i);
		t2.setDaemon(true);
		t.start();
		t2.start();
		t2.setPriority(1);
		t2.setName("CHINCH");
		
	}

	

}
