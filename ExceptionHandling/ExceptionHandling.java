package ExceptionHandling;
import java.util.Scanner;

public class ExceptionHandling {

			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				
				System.out.print("Enter an integer: ");
				String string = scanner.nextLine();
				
				try {
					int square = Integer.parseInt(string);
					System.out.println("The square value is: " + square * square);
					System.out.println("The work has been done successfully");
				} 
				catch (NumberFormatException e) {
					System.out.println("Entered input is not a valid format for an integer.");
					
				}
				
				scanner.close();

			}

		}


