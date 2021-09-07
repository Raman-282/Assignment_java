package com.demo;

public class Triangle_2 {
    int s1,s2,s3;
    public Triangle_2(int side1,int side2,int side3)
     {
        s1=side1;
        s2=side2;
        s3=side3;
     }
       public static void main(String[] args)
       {
             Triangle_2 t1=new Triangle_2(3,4,5);
             int perimeter=(t1.s1+t1.s2+t1.s3);
             System.out.println("perimeter is:"+perimeter);
             int sp=(perimeter/2);
             int ar=((((sp*(sp-t1.s1))*(sp-t1.s2))*(sp-t1.s3)));       
             int area=(int)Math.sqrt(ar);   
             System.out.println("Area is:"+area);
        }
}


