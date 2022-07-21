class Student{
    String name;
    int id;
    public Student(){
        System.out.println("Default Constructor");
    }
    public Student(int sid){
        this();
        System.out.println("1 Parameterised Constructor"); 
    }
    public Student(int id,String name){
        this(id);
        this.id = id;
        this.name = name;
        System.out.println("2 Parameterised Constructor"); 
    }
}
public class Main{
    public static void main(String[] args) {
        Student s1 = new Student(191230,"Abhinav");
        System.out.println(s1.name);
        System.out.println(s1.id);
    }
}