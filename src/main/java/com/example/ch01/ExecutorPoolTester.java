package com.example.ch01;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

public class ExecutorPoolTester {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newCachedThreadPool();
		
		ThreadLocal<Integer> local;
		
		ThreadFactory factory;
		
		Callable<Integer> callable;
		
		Future<Integer> future; 
		
		ForkJoinPool forkJoinPool;
	}

}
