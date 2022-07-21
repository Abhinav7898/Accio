class A{
    // void fun(){
    //     System.out.println("Class A");
    // }
}
class B extends A{
    void fun(){
        // super.fun();
        System.out.println("Class B");
    }
}
class C extends B{
    void fun(){
        super.fun();
        System.out.println("Class C");
    }
}
public class Main{
    public static void main(String[] args) {
        C c1 = new C();
        c1.fun();
    }   
}