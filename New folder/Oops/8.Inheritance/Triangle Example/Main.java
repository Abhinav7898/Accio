class Shape{
    String color;
    int length;
    int breadth;
    int height;
}
class Triangle extends Shape{
    void printColor(){
        System.out.println("Tringle color is "+color);
    }
    void printLength(){
        System.out.println("Triangle length is "+ length);
        printBreadth();
    }
    void printBreadth(){
        System.out.println("Triangle breadth is "+ breadth);
        printHeight();
    }
    void printHeight(){
        System.out.println("Triangle height is "+ height);
    }
}
public class Main{
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Red";
        t1.length = 10;
        t1.breadth = 12;
        t1.height = 15;
        t1.printColor();
        t1.printLength();
    }
}