package com.example.ch01;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableFutureTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Callable<Integer> callable = new CallableExample();
		FutureTask<Integer> futureTask = new FutureTask<>(callable);
		Thread thread = new Thread(futureTask);
		
//		futureTask.cancel(true);
		
		
		/*
		 
		 */
		
		thread.start();
		futureTask.cancel(true);
//		futureTask.cancel(false);
		
		try {
			System.out.println(futureTask.get());
		} catch (InterruptedException |  ExecutionException | CancellationException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
	}

}
