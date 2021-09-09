package MainPackage;
import Addition.AdditionService;
import Subtraction.SubtractionService;
import Multiplication.MultiplicationService;
import Division.DivisionService;
import EvenOdd.EvenOddService;

public class MainClient {
	public static void main(String args[]) {
		AdditionService additionService=new AdditionService();
		int resultSum=additionService.implementAddition(2, 3);
		System.out.println("Sum = "+resultSum);
		
		SubtractionService subtractionService=new SubtractionService();
		int resultSub=subtractionService.implementSubtraction(2, 3);
		System.out.println("Subtraction = "+resultSub);
		
		MultiplicationService multiplyService=new MultiplicationService();
		int resultMultiply=multiplyService.implementMultiplication(2, 3);
		System.out.println("Multiplication = "+resultMultiply);
		
		DivisionService divisionService=new DivisionService();
		float getResult=divisionService.implementDivision((float)2,(float)3);
		System.out.println("Division = "+getResult);
		
		EvenOddService oddEven=new EvenOddService();
		int num=8;
		int resultOE=oddEven.getEvenOdd(num);
		if(resultOE==1) {
			System.out.println(num+" is even");
		}
		else {
			System.out.println(num+"is odd");
			EvenOddService oddEven1=new EvenOddService();
			oddEven1.getEvenOddNum(8);
		}
		
	}
	

}
