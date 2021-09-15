package Stream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLine {
public static void main(String[] args) {        
        
        try {            
           File fileName = new File("E:\\abc.txt");
            FileReader fileReader = new FileReader(fileName);     
            BufferedReader bufferedreader = new BufferedReader(fileReader);           
            StringBuffer sb = new StringBuffer();
            String strLine;            
           while ((strLine = bufferedreader.readLine()) != null) {
                sb.append(strLine);
                sb.append("\n");        
            }         
           fileReader.close();
           System.out.println(sb.toString()); 
         } catch (IOException e) {
            e.printStackTrace();     
   }
 
    }
 

}
