package com.multithreading.extendingThread;

public class MultithreadDemo extends Thread {
	
	public void run() {
		
		try {
			System.out.println("Thread :"+Thread.currentThread().getId());			
		}catch(Exception e) {
			System.out.println("exception caught");
		}
	}

}
