package Sample1;

import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(); //Own Reference
        Student stu1 = new Student();

        List<Integer> list1 = new ArrayList<Integer>(); //Parent Reference

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove(2); //Can remove data from anywhere where in array it's not possible

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        list.forEach(i-> System.out.println(i)); //New way of printing output

        List<Integer> linkedlist= new LinkedList<>(); //Linked list

        //Mapping
        //HashMap Makes searching of data efficient with hashCode() and equals()
        HashMap<Integer, String> map = new HashMap<>(); //<KEY , VALUE>
        Map<Integer, String> map1 = new HashMap<>();

        map.put(100,"Hashim");
        map.put(200,"Chandana");
        map.put(101,"Hashim");
        map.put(100,"Qureshi");
        System.out.println(map.isEmpty());
        System.out.println(map.size());

    }
}
