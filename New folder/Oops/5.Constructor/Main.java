class Student {
    String name;
    int id;

    public Student() { // Non parameterised constructor called
        name = "Default Name";
        id = 00;
        System.out.println("Contructor called");
    }

    public Student(int sid, String sname) {
        name = sname;
        id = sid;
        System.out.println("Parameterised contructor called");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s0 = new Student(); // Non parameterised constructor
        // s1.name = "Abhinav";
        // s1.id = 191230;
        Student s1 = new Student(191230, "Abhinav"); // Parameterised Contructor
        System.out.println(s1.name);
        System.out.println(s1.id);
    }
}