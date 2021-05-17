package com.multithreading.proco;

public class Company {

	int n;
	boolean flag = false;
	//flag = false = producer
	//flag = true = consumer
	synchronized  public void produce_item(int n) {
		if(flag==true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.n = n;
		System.out.println("Produced : "+this.n);
		flag = true;
		notify();
	}
	synchronized public int consumer_item() {
		if(flag==false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consumed : "+this.n);
		flag = false;
		notify();
		return this.n;
	}

}
