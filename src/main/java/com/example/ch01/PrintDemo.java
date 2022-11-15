package com.example.ch01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintDemo {

	private final Lock lock = new ReentrantLock();
}
