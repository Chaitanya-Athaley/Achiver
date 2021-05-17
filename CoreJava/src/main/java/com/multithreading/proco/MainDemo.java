package com.multithreading.proco;

public class MainDemo {

	public static void main(String[] args) throws InterruptedException {
		Company comp = new Company();
		Producer producer = new Producer(comp);
		Consumer consumer = new Consumer(comp);
		producer.start();
		consumer.start();
	}

}
