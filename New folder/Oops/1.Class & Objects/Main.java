class Student{
    String name ; // data members or object Variable with default values
    int id;
}
public class Main{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Abhinav";
        s1.id = 191230;
        System.out.println(s1.name);
        System.out.println(s1.id);
    }
}