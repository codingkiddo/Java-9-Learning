package com.example.ch01;


public class ThreadMain {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getState());
		
		Thread t1 = new Thread();
		System.out.println(t1.getState());
		System.out.println(t1.getStackTrace());
		
	}

}
