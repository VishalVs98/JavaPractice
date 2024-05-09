package com.multithreading.extendingRunnable;

public class Multithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		for(int i=0;i<n;i++) {
			Thread object
			= new Thread(new MultiThreadingDemo());
			object.start();
		}
	}

}
