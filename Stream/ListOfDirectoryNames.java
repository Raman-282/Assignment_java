package Stream;
import java.io.File;
import java.util.Date;
public class ListOfDirectoryNames {
	 public static void main(String[] args)
     {
        File file = new File("C:\\Users\\raman.chaudhry\\Documents\\workspace-spring-tool-suite-4-4.11.0.RELEASE");
        String[] fileList = file.list();
        for(String str:fileList){
            System.out.println(str);
        }
    }
}