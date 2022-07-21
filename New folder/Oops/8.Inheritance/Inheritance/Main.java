class A{
    int a;

    public A() {
        System.out.println("Constructor inside A");
    }
    public A(int a){
        System.out.println("Parameterised Constructor of A");
    }
}
class B extends A{
    int b;
    public B(){
        System.out.println("Constructor inside B");
    }
    public B(int b){
        // this();
        this.b = b;
        System.out.println("Parameterised Constructor of B");
    }
}
class C extends B{
    public C(){
        System.out.println("Constructor inside C");
    }
}

public class Main{
    public static void main(String[] args) {
        // C c1 = new C();
        B b1 = new B(5);
    }
}