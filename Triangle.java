package com.demo;

public class Triangle {
	int s1=3;
	int s2=4;
	int s3=5;
	public static void main(String args[]) {
		Triangle t1=new Triangle();
		int perimeter=(t1.s1+t1.s2+t1.s3);
		System.out.println("perimter is "+perimeter);
		  int sp=(perimeter/2);
          int ar=((((sp*(sp-t1.s1))*(sp-t1.s2))*(sp-t1.s3)));       
          int area=(int)Math.sqrt(ar);   
          System.out.println("Area is:"+area);
   }

		
		
	}
			


