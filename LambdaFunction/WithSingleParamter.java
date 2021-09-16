package LambdaFunction;
//with parameter with return type
interface Sayable2 {



  String Say(String name);
public class WithSingleParamter {
    public static void main(String[] args) {
        Sayable2 s = (name) -> {

 

            return "my name is .." + name;
        };

 

        System.out.println(s.Say("raman"));

 

    }

 

}
}


