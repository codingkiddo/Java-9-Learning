package com.example.ch01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Running !!");
	}
	
}

public class ExecutorTester {

	public static void main(String[] args) {

		Runnable job = new MyRunnable();
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(job);
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		executorService.shutdown();
		
	}

}
