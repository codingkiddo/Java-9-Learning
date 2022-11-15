package com.example.ch01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

public class WorkerForReentrantLock implements Runnable {

	private String name;
	private ReentrantLock lock;

	public WorkerForReentrantLock(ReentrantLock lock, String name) {
		this.lock = lock;
		this.name = name;
	}

	@Override
	public void run() {

		boolean done = false;

		while (!done) {
			boolean isLockAvailable = lock.tryLock();
			if (isLockAvailable) {

				try {
					Date date = new Date();
					SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");

					System.out.println("Task name - " + name + " outer lock acquired at " + dateFormat.format(date)
							+ " Doing outer work");
					Thread.sleep(1500);

					// Getting Inner Lock
					lock.lock();

					try {
						date = new Date();
						dateFormat = new SimpleDateFormat("hh:mm:ss");
						System.out.println("Task name - " + name + " inner lock acquired at " + dateFormat.format(date)
								+ " Doing inner work");
						System.out.println("Lock Hold Count - " + lock.getHoldCount());
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} finally {
						// Inner lock release
						System.out.println("Task name - " + name + " releasing inner lock");

						lock.unlock();
					}
					System.out.println("Lock Hold Count - " + lock.getHoldCount());
					System.out.println("Task name - " + name + " work done");

					done = true;

				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					// Outer lock release
					System.out.println("Task name - " + name + " releasing outer lock");

					lock.unlock();
					System.out.println("Lock Hold Count - " + lock.getHoldCount());
				}

			} else {
				System.out.println("Task name -  " + this.name + ", waiting for lock !!");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
