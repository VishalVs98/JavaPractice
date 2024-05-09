package com.multithreading.extendingRunnable;

public class Test implements Runnable{
    public static Thread thread1;
    public static Test obj;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		obj =new Test();
		thread1=new Thread(obj);
		 // thread1 created and is currently in the NEW
        // state.
        System.out.println(
            "State of thread1 after creating it - "
            + thread1.getState());
        thread1.start();
        
        System.out.println(
                "State of thread1 after calling .start() method on it - "
                + thread1.getState());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		thread mythread=new thread();
		Thread thread2=new Thread(mythread);
		
		 // thread1 created and is currently in the NEW
        // state.
        System.out.println(
            "State of thread2 after creating it - "
            + thread2.getState());
        thread2.start();
 
        // thread2 moved to Runnable state
        System.out.println(
            "State of thread2 after calling .start() method on it - "
            + thread2.getState());
   
        
        // moving thread1 to timed waiting state
        try {
            // moving thread1 to timed waiting state
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(
            "State of thread2 after calling .sleep() method on it - "
            + thread2.getState());
 
        try {
            // waiting for thread2 to die
            thread2.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(
            "State of thread2 when it has finished it's execution - "
            + thread2.getState());
    
	}

}
