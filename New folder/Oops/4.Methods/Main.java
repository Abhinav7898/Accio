class Student{
    String name = "Default";
    int id = 0;
    void write(){
        System.out.println("Student: "+name+",id: "+id+" writes");
    }
    void code(){
        System.out.println("Student: "+name+",id: "+id+" codes");
    }
}
public class Main{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Abhinav";
        s1.id = 191230;
        s1.write();
        s1.code();

        Student s2 = new Student();
        s2.write();
        s2.code();

    }
}