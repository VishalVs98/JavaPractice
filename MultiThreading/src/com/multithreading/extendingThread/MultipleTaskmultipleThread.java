package com.multithreading.extendingThread;

public class MultipleTaskmultipleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MyThread1 t1= new MyThread1();
      t1.start();
      MyThread2 t2= new MyThread2();
      t2.start();
	}
}
