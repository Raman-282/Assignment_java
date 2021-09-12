package com.Threads;

public class Threads1 extends Thread{
	public void run() {
		try {
			System.out.println("list of threads running"+Thread.currentThread());
			}
		catch(Exception e) {
			System.out.println("exception caught"+ e);
		}
		
	}

}
 class Threads{
	public static void main(String ar[]) {
		int numberOfThreads=2;
		for (int i = 0; i < numberOfThreads; i++) {
			 
            Threads1 threads1 = new Threads1();
 
            threads1.start();// life cycle of threads start() call the run method
 
		}
	
	}
}
 