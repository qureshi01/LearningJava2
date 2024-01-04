package Sample1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("abc.txt");
            pw.print("hello");
       // } catch (FileNotFoundException ex) {
        //    System.out.println("File was not found");
        } catch(IOException e){
              System.out.println("IOEXCEPTION");  //it is not thrwing an error because it is a parent class of filenotfoundexception
        }
        System.out.println("Done");
    }
}
