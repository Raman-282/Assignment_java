package com.demo;

public class Student_two {
	
		int rollnosam=9;
		int rollnojohn=14;
		long phonenosam=9933445577L;
		long phonenojohn=8844229900L;
		String addresssam="NEWYORKSTREET";
		String addressjohn="EUROPE";
		public static void main(String args[]) {
			Student_two sam=new Student_two();
			Student_two john=new Student_two();
			System.out.println(sam.rollnosam);
			System.out.println(john.rollnojohn);
			System.out.println(sam.phonenosam);
			System.out.println(john.phonenojohn);
			System.out.println(sam.addresssam);
			System.out.println(john.addressjohn);

}
}