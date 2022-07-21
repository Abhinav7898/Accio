package Package1;

class DefaultExample{
    int a;
    String name;
}

public class Main{
    public static void main(String[] args) {
        DefaultExample d1= new DefaultExample();
        d1.a = 5;
        d1.name = "Abhinav";
        System.out.println(d1.a);
        System.out.println(d1.name);
    }
}