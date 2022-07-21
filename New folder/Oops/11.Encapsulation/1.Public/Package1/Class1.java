package Package1;
import Package2.*;
public class Class1{
    public static void main(String[] args) {
        Class2 cl = new Class2();
        System.out.println(cl.a);
        cl.fun1();
        // cl.fun2(); // Error because Method fun2 is not Public
        // Dummy d = new Dummy(); // Error because Class Dummy is not Public

    }
}