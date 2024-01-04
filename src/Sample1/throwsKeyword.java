package Sample1;

import java.io.IOException;
import java.io.PrintWriter;

public class throwsKeyword {
    public static void main(String[] args) throws IOException {
        int x=10;
        int y=0;

        try {
            int z = x / y;
            fun();
        }catch(ArithmeticException ex){
            System.out.println("ArithmeticError");
        }catch (IOException ex){
            System.out.println("FileNotFound");
        }

        System.out.println("Done");
    }

    public static void fun() throws IOException{
           PrintWriter pw = new PrintWriter("abc1.txt");
    }
}
