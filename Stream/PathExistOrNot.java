package Stream;
import java.io.File;
public class PathExistOrNot {
    public static void main(String[] args) {
        // Create a File object
        File my_file_dir = new File("E:\\abc.txt");
         if (my_file_dir.exists()) 
           {
            System.out.println("The directory or file exists.\n");
           } 
         else
          {
            System.out.println("The directory or file does not exist.\n");
          }
       }
  }


