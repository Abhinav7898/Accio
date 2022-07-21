class A{
    int a;
    public A(){
        System.out.println("Non parametised constructor called");
    }
    public A(int a){
        this.a = a;
        System.out.println("Parametirised contructor called: "+this.a);
    }
}
class B extends A{
    int b;
    // Automatcally, Non Parametirised constructor of parent class gets call
    public B(int b){
        super(b*2); // This calls the parent constructor
        this.b = b;
        System.out.println("Paramerised construtor: "+this.b);
    }
    void printVal(){
        System.out.println("The value of a is: "+super.a);
        System.out.println("The value of b is: "+b); // this .b

    }
} 

public class Main{
    public static void main(String[] args) {
        B b1 = new B(4);
        b1.printVal();
    }
}