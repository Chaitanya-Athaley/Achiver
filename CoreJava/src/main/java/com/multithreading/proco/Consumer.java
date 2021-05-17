package com.multithreading.proco;

public class Consumer extends Thread{

	Company c ;



	public Consumer(Company c) {
		this.c = c;
	}



	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			this.c.consumer_item();
			try {
				Thread.sleep(4000);
			} catch (Exception e) {
			}
			//System.out.println("HI i am Consumer thd "+Thread.currentThread().getPriority()+" :::: "+i);
		}
	}
}
