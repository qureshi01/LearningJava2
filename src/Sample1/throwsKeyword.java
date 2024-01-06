package Sample1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;

public class throwsKeyword {
    public static void main(String[] args) throws IOException {
        int x=10;
        int y=getFromDB();
        int z=0;
        try {
            z = x / y;

        }catch(ArithmeticException ex){
            System.out.println("ArithmeticError");
        }//catch (IOException ex){
        //   System.out.println("FileNotFound");
        //}
        fun(z);
        System.out.println("Done");
    }

    private static int getFromDB() {
        return 0;
    }

    public static void fun(int z){ //throws IOException{
        if(z<=0){
            //throw new InputMismatchException("Invalid Input");
            throw new DobAgeNotMatchingException("DOB DOESN'T MATCH"); //user-defined exception
        }
          // PrintWriter pw = new PrintWriter("abc1.txt");
          // pw.println(z);
    }
}
