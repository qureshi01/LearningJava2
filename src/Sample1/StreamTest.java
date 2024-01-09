package Sample1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //int[] arr= new int[]{1,2,3,4,5};

        //Arrays.stream(arr);

        list.stream().map(i->i*10).forEach(i-> System.out.println(i));

        list.stream().filter(i-> i>2).forEach(i-> System.out.println(i));
        List<Integer> list1= list.stream().filter(i->i>2).collect(Collectors.toList());
        list1.stream().forEach(i-> System.out.println(i));
    }
}
