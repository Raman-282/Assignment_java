package com.demo;

public class Rectangle {
	
	   
	   int l1=4,b1=5,l2=5,b2=8;
	  public static void main(String[] args)
	    {
	            Rectangle rectangle=new Rectangle();
	            System.out.println("Area of rectangle 1 is :"+rectangle.Area(rectangle.l1,rectangle.b1));
	            System.out.println("Area of rectangle 2 is :"+rectangle.Area(rectangle.l2,rectangle.b2));
	     }
	     public int Area(int length,int breadth)
	     {
	               return length*breadth;   
	     }


}
