package com.multithreading.extendingThread;

public class SingleTaskMultipleThread extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTaskMultipleThread t1=new SingleTaskMultipleThread();
		t1.start();
		SingleTaskMultipleThread t2=new SingleTaskMultipleThread();
		t2.start();
	}
	public void run() {
		System.out.println("Thread task");	}

}
