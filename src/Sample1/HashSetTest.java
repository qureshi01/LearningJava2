package Sample1;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Integer> set1= new HashSet<>();

        set1.add(10);
        set1.add(15);
        set1.add(20);
        set1.add(10);
        set1.add(25);
        set1.add(20);

        //unordered and only outputs unique values

        

        System.out.println(set1);

    }
}
