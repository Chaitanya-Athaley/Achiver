package com.threadDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executerr {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		executorService.execute(new Runnable() {
		    public void run() {
		        System.out.println("Asynchronous task");
		    }
		});

		executorService.shutdown();

	}

}
