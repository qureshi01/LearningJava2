package Sample1;

public class DemoLambdaExp {
    public static void main(String[] args) {
        TestInterfaceSum testInterface = (i,j)->{
            return i+j;
        };
        TestInterfaceMultiply testInterface1 = (i,j)->{
            return i*j;
        };
        TestInterfaceSubstract testInterface2 = (i,j)->{
            return i-j;
        };
        System.out.println(testInterface.m1(10,20));
        System.out.println(testInterface1.m1(10,20));
        System.out.println(testInterface2.m1(10,20));
    }
}
