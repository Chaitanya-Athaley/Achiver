package com.multithreading.proco;

public class Producer extends Thread{

	Company c;

	public Producer(Company c) {
		this.c = c;
	}



	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			this.c.produce_item(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//System.out.println("HI i am 1 st thd "+Thread.currentThread().getName()+" :: "+i);
		}
	}

}
