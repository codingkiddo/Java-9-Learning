package com.example.class_loading;

import java.lang.reflect.Array;

//Java code to demonstrate Class Loader subsystem
public class Test {
	public static void main(String[] args) {
		// String class is loaded by bootstrap loader, and
		// bootstrap loader is not Java object, hence null
		System.out.println(String.class.getClassLoader());

		// Test class is loaded by Application loader
		System.out.println(Test.class.getClassLoader());
		
		
		int a[] = {1,2,3,4,5};
		System.out.println(a.getClass().getName());
		Array arr;
//		System.out.println([I);
	}
}