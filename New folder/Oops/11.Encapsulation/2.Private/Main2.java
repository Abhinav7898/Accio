public class Main2 {
    private int a = 5;
    private void fun(){
        System.out.println("This is a private function");
    }
    public static void main(String[] args) {
        Main2 m1 = new Main2(); // we are doing it in the same class as the private variable
        System.out.println(m1.a);
        m1.fun();
    }
}
