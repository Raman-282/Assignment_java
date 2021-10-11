package com.guitar.piano;
//1.	Create two interfaces Piano & Guitar with single default method void play() with different implementations. Add single implementation class Instrument for both the interfaces. Solve method name ambiguity in Instrument class by using two different approaches.
interface Guitar {
	public void play();
}

interface Piano {
	public void play();
}

class Instrument implements Guitar, Piano {
	public void play() { 
		System.out.println(" Instrument is being played");
	}
}


public class MainClass {

	public static void main(String[] args) {
		Guitar g1; //instance variable for Guitar Interface
		Piano g2; //instance variable for Piano Interface.
		g1 = new Instrument();
		g2 = new Instrument();
		System.out.print("Guitar");
		g1.play();
		System.out.print("Piano");
		g2.play();
	}
}
