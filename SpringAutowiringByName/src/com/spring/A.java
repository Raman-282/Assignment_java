package com.spring;

public class A {
	// reference of class B
	B b;//property

	public A() {

		System.out.println(" from  class A");

	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

// this print method for class A and calling from show()  method

	void print() {

		System.out.println(" print() from A");
	}

// this method is belong for class A

	public void show() {

		print();//this method for  A class
		b.print();// this print method belongs to class B

	}

}


