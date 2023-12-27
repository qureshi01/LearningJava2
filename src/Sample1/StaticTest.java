package Sample1;

public class StaticTest {

    static int[] arr;

    static final int x; //since it is static final we have to provide value

    static{
       //static block when class runs
        arr = new int[]{1,2,3,4};
        x=100;
        System.out.println("INSIDE THE STATIC BLOCK");
    }

    StaticTest(){
        System.out.println("INSIDE THE STATIC TEST");
    }

    void fun(){
        System.out.println("INSIDE FUN");
    }

    public static void main(String[] args) {
        StaticTest st = new StaticTest();
        st.fun();
    }

}
