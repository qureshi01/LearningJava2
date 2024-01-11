package Sample1;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        int i =15;
        Predicate<Integer> pre1 = j-> (j>10 || j==0);
        System.out.println(pre1.test(15));
        System.out.println(pre1.test(1));
        System.out.println(pre1.test(0));


    }
}
