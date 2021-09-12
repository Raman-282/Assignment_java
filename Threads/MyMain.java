/*
 Create a class called MyCurrentDate that implements Runnable interface.The MyCurrentDate class displays the 
 current date and time 10 times, with 100 milli seconds interval - use sleep() method for this interval.
 Create a class called MyMain, which contans main() method, in which 3 instances of MyCurrentDate threads 
 are being run.
 */
package com.Threads;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

 class DateAndTime {
		public void printDateTime(String message) {
			for(int i=1;i<=10;i++) {
				DateTimeFormatter datetimeFormatter=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
				LocalDateTime datetime=LocalDateTime.now(); 
				System.out.println(message+" Date "+i+" times : "+datetimeFormatter.format(datetime));
				
				try {
					Thread.sleep(100);
				}
				catch(Exception e) {
					System.out.println(e);
					
				}
			}
			
		}
	}

	//First
	class MyCurrentDate implements Runnable{
	    String msg="First Thread";
		DateAndTime datetime;
		MyCurrentDate(DateAndTime datetime) {
			this.datetime=datetime;
		}
		public void run() {
			
			datetime.printDateTime(msg);		
		}
		
	}

	//Second
	class MyCurrentDate2 implements Runnable{
	    String msg="Second Thread";
		DateAndTime datetime;
		MyCurrentDate2(DateAndTime datetime) {
			this.datetime=datetime;
		}
		public void run() {
			
			datetime.printDateTime(msg);		
		}
		
	}

	//Third
	class MyCurrentDate3 implements Runnable{
	  String msg="Third Thread";
		DateAndTime datetime;
		MyCurrentDate3(DateAndTime datetime) {
			this.datetime=datetime;
		}
		public void run() {
			
			datetime.printDateTime(msg);		
		}
		
	}

	public class MyMain {
		
		public static void main(String args[]) {
			
			DateAndTime dateandtime=new DateAndTime();
			MyCurrentDate myCurrentDate=new MyCurrentDate(dateandtime);
			Thread thread=new Thread(myCurrentDate);
			
			//For second thread
			MyCurrentDate2 myCurrentDate2=new MyCurrentDate2(dateandtime);
			Thread thread2=new Thread(myCurrentDate2);
			
			//For third thread
			MyCurrentDate3 myCurrentDate3=new MyCurrentDate3(dateandtime);
			Thread thread3=new Thread(myCurrentDate3);
			
			thread.start();		
			thread2.start();		
			thread3.start();
			
		}

}
