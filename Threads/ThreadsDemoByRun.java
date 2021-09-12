package com.Threads;

class ThreadRunDemos implements Runnable{

	public void run() {
		
		//Logic part
		try {
			
			System.out.println("List of threds running "+Thread.currentThread());
		}
		catch(Exception e) {
			System.out.println("exceotion caught" + e);
			
		}
		
	}
	
}
public class ThreadsDemoByRun {
	
	public static void main(String args[]) {
		
	int numberOfThreads = 2;	 

    for (int i = 0; i < numberOfThreads; i++) {
    	
    	Thread thread=new Thread(new ThreadRunDemos());
        thread.start();// life cycle of threads start() call the run method
        thread.setName("thread");
        thread.setPriority(6);
    }
	}
}

