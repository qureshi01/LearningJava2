package Sample1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpressionTest {
    public static void main(String[] args) {
        //List<String> list = Arrays.asList(new String[]{"a","b","c"});
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        //System.out.println(list);

        //list.stream().map(i->i+2.)//not completed
        list.forEach(i-> System.out.println(i));
    }
}
