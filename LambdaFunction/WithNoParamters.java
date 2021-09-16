package LambdaFunction;
interface Sayable {

String Say();

}

 

public class WithNoParamters {


    public static void main(String[] args) {
        Sayable s = () -> {

 

            return "hi how are you";
        };

 

        System.out.println(s.Say());

 

    }
}
 


