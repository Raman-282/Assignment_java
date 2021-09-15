package Stream;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class CopyFile {
 
    
    public static void main(String ar[]) throws IOException {
 
        FileReader in = new FileReader("E:\\abc.txt");
        FileWriter out = null;
 
        try {
 
        
            out = new FileWriter("E:\\abc.txt");// output
 
            int c;
            while ((c = in.read())!=-1) {
 
                out.write(c);/// out put will generate on file instead of console
 
            }
 
            
            System.out.println("Done....");
 
        } catch (Exception e) {
 
            e.printStackTrace();
        }
 
        finally {
 
            in.close();
            out.close();
        }
 
    }
 
}


