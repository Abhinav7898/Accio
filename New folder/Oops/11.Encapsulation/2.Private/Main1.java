class pvtDemo{
    // int a  = 5;
    private int a  = 5; // Only allow access within the class
}

public class Main1{
    public static void main(String[] args) {
        pvtDemo p1 = new pvtDemo();
        // p1.a = 5; 
        // System.out.println(p1.a); 
    }
}