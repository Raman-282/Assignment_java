package LambdaFunction;
interface Addable{
    
    //witha parameters
    int add(int a,int b ,int c);
}

 


public class WithMultipleParamters {
	public static void main(String[] args) {

		 

        Addable d1 =(a,b,c)->(a+b+c);//without data type
        
        System.out.println(d1.add(20, 30,60));
        
        
    Addable d2 =(a,b,c)->(a+b+c);//without data type in lambda exp
        
        System.out.println(d2.add(12, 30,60));

 


    }

 

}


