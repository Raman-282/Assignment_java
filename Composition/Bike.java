package Composition;

public class Bike {
	// Instance members of class bike
		private String color;
		private int maxSpeed;

		// Methods implementation

		// Method 1
		// To set the maximum speed of bike
		public void setMaxSpeed(int maxSpeed) {
			// This keyword refers to current object itself
			this.maxSpeed = maxSpeed;
		}

		// Method 2
		// To set the color of bike
		public void setColor(String color) {
			// This keyword refers to current object
			this.color = color;
		}

		// Method 3
		// To display bike information
		public void carInfo() {
			// Print the car information - color and speed
			System.out.println("Car Color= " + color + " Max Speed= " + maxSpeed);
		}

		public void bikeInfo() {
			// TODO Auto-generated method stub
			
		}

		
	}

	//Class2
	//Child class
	//Helper class
	class Hero extends Bike {

		// Method in which it is shown
		// what happened with the engine of Hero
		public void HeroStartDemo() {
			// Creating an object of Engine type
			// using stop() method
			// Here, HeroEngine is name of an object
			Engine HeroEngine = new Engine();
			HeroEngine.start();
			HeroEngine.stop();
		}
	}

	//Class 3
	//Helper class
	class Engine {

		// Method 1
		// To start a engine
		public void start() {
			// Print statement when engine starts
			System.out.println("Started:");
		}

		// Method 2
		// To stop a engine
		public void stop() {
			// Print statement when engine stops
			System.out.println("Stopped:");
		}
		// Main driver method
			public static void main(String[] args) {
				// Creating an object of Bike class
				Bike karizma = new Bike();

				// Assigning bike object color
				karizma.setColor("RED");

				// Assigning bike object speed
				karizma.setMaxSpeed(129);

				// Calling bikeInfo() over object of Bike class
				karizma.bikeInfo();

				// Creating an object of Hero class
				Hero quattroporte = new Hero();

				// Calling HeroStartDemo() over
				// object of Hero class
				quattroporte.HeroStartDemo();
			}

	}


