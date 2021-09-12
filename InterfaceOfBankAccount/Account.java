package InterfaceOfBankAccount;

import java.io.IOException;
import java.util.Scanner;
//Account parent class

class Account {
	//Variables  of the user details
	
		private String accountNumber;
		private String customerName;
		private double balance;
		
		
		public Account(String accountNumber,String customerName,double balance){
			this.accountNumber=accountNumber;
			this.customerName=customerName;
			this.balance=balance;
		}
		public String getAccountNumber() {
			return accountNumber;
		}


		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}


		public String getCustomerName() {
			return customerName;
		}


		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}


		public double getBalance() {
			return balance;
		}


		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		//Show information of the user
		
			public void displayInformation() {
				System.out.println("Customer Name "+getCustomerName());
				System.out.println("Account Number "+getAccountNumber());
				System.out.println("Account Balance "+getBalance());
				
			}
	}

	//Interface for the  Maintenance Charges

	interface MaintenanceCharge{
		public float calculateMaintenanceCharge(float noOfYear);
	}

	// CurrentAccount class is child class of Account class

	class CurrentAccount extends Account implements MaintenanceCharge{
		float m=100;
		
		public CurrentAccount(String accountNumber,String customerName,double balance){
			super(accountNumber,customerName,balance);
		}

		public float calculateMaintenanceCharge(float noOfYear) {
			float n=noOfYear;
			return ((m*n)+(float)200);
		}
			
	}

	//SavingAccount class is child class of Account  class

	class SavingAccount extends Account implements MaintenanceCharge{
		
		float m=50;
		float maintenanceCharge;
		public SavingAccount(String accountNumber,String customerName,double balance) {
			super(accountNumber,customerName,balance);
		}
		
		public float calculateMaintenanceCharge(float noOfYear) {
			float n=noOfYear;
			return ((m*n)+(float)50);
		}
		
	}

	//Interface class 

	class Interface {
		
		public static void main(String args[])throws IOException {
			
			int choice;
			float noOfYear;
			String accountNumber;
			String customerName;
			double balance;
			float maintenanceCharge;
			
			//creating object of the user
			
			Scanner userInput=new Scanner(System.in);
			System.out.println("1. Saving Account \n2. Current Account");
			
			//For asking the user choice
			
			System.out.println("Enter your choice: ");
			choice=Integer.parseInt(userInput.nextLine());
			
			
			switch(choice){
				case 1:
					
					//Input to take from the user
					
					System.out.println("Enter the Account number");
					accountNumber=userInput.nextLine();
					System.out.println("Enter the Customer Name");
					customerName=userInput.nextLine();
					System.out.println("Enter the Balance amount");
					balance=Double.parseDouble(userInput.nextLine());
					System.out.println("Enter the number of years");
					noOfYear=Float.parseFloat(userInput.nextLine());
					
					//Creating object of Saving Account 
					
					SavingAccount savingAccount=new SavingAccount(accountNumber, customerName, balance);
				    maintenanceCharge=savingAccount.calculateMaintenanceCharge(noOfYear);
				    savingAccount.displayInformation();
					System.out.println("Maintenance Charge for Saving Account is Rs "+maintenanceCharge);
					break;
					
				case 2:
					
					//Input from the user
					
					System.out.println("Enter the Account number");
					accountNumber=userInput.nextLine();
					System.out.println("Enter the Customer Name");
					customerName=userInput.nextLine();
					System.out.println("Enter the Balance amount");
					balance=Double.parseDouble(userInput.nextLine());
					System.out.println("Enter the number of years");
					noOfYear=Float.parseFloat(userInput.nextLine());
					
					//Creating object of Current Account 
					
					CurrentAccount currentAccount=new CurrentAccount(accountNumber, customerName, balance);
				    maintenanceCharge=currentAccount.calculateMaintenanceCharge(noOfYear);
				    System.out.println("Customer Name "+currentAccount.getCustomerName());
					System.out.println("Account Number "+currentAccount.getAccountNumber());
					System.out.println("Account Balance "+currentAccount.getBalance());
					currentAccount.displayInformation();
					System.out.println("Maintenance Charge for Current Account is Rs "+maintenanceCharge);
					break;
					
				default:
					System.out.println("Invalid choice");
					break;				
			}
			
			
		}

	}
	

