package Sample1;

import java.util.Optional;

public class OptionalTest {
    //static Student stu;
    static Student stu = new Student();
    public static void main(String[] args) {
        //Student stu = new Student();

        Optional<Student> opt = Optional.of(stu);

        Student defaultStu = new Student();
        Optional<Student> opt1 = Optional.ofNullable(stu);

        Student result = Optional.ofNullable(stu).orElse(defaultStu);
        if(opt.isPresent()){
            stu.name="Hashim";
        }
        System.out.println(opt1.isPresent());
        System.out.println(opt.get());
        System.out.println(opt.isEmpty());
    }
}
