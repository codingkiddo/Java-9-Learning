package com.example.class_loading;

import sun.misc.Launcher;

import java.net.URL;

public class Demo01 {

	public static void main(String[] args) {

		// Bootstrap Boot class loader
		// Print as null, Because Bootstrap yes C++ Realized .
		ClassLoader classLoader = Object.class.getClassLoader();
		System.out.println(classLoader);

		// Check that the boot class loader will load those jar package
		URL[] urls = Launcher.getBootstrapClassPath().getURLs();
		for (URL urL : urls) {

			System.out.println(urL);
		}

	}
}
