package com.example.ch01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class MainForReentrantLock {

	public static void main(String[] args) {

		ReentrantLock lock = new ReentrantLock();
		ExecutorService pool = Executors.newFixedThreadPool(4);
		Runnable r1 = new WorkerForReentrantLock(lock, "Job-1");
		Runnable r2 = new WorkerForReentrantLock(lock, "Job-2");
		Runnable r3 = new WorkerForReentrantLock(lock, "Job-3");
		Runnable r4 = new WorkerForReentrantLock(lock, "Job-4");
		
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		
		pool.shutdown();
	}

}
