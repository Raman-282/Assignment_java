package SuperKeyword;

public class Customer {
		void message()
		{
			System.out.println("Hello");
		}
	}

	class Employee extends Customer
	{
		void message()
		{
			System.out.println("This is Raman");
		}

		void display()
		{
			
			message();
			super.message();
		}
	}

	class Test
	{
		public static void main(String args[])
		{
			Employee employee = new Employee();
			employee.display();
		}
	}

