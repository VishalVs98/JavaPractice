package com.multithreading.extendingThread;

public class Multithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=8;//number of threads
       for(int i=0;i<n;i++) {
    	  MultithreadDemo d=new MultithreadDemo();
    	  d.start();
       }
	}

}
