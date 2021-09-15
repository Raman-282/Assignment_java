package Stream;
import java.io.File;
import java.io.FileInputStream;
public class ByteToArray {
	   public static void main(String args[]) throws Exception {
		      File file = new File("E:\\\\abc.txt");
		      FileInputStream fis = new FileInputStream(file);
		      byte[] bytesArray = new byte[(int)file.length()];
		      fis.read(bytesArray);
		      String s = new String(bytesArray);
		      System.out.println(s);
		   }
		}


