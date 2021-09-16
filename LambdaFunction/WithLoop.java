package LambdaFunction;
import java.util.ArrayList;
import java.util.List;
//loop demo
public class WithLoop {
    public static void main(String[] args) {
        List<String> listname = new ArrayList<String>();

 

        listname.add("raman");
        listname.add("ram");
        listname.add("vivek");
        listname.add("abhinav");

 

        listname.forEach((n) -> System.out.println(n));

 

    }

 

}


