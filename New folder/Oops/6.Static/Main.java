class Student{
    static int count = 0; //This is a Class Level Variable
    // Getting declared or initialized when code for class is compiled
    // It does not wait for object creation 
    int id;
    String name;
    public Student(){
        count++;
        System.out.println(count);
    } 
    public Student(int id){
        count++;
        System.out.println(count);
    }
    public Student (String sname){
        count++;
        System.out.println(count);
    }
    static void works(){
        System.out.println("Student works");
        codes();
    }
    static void codes(){
        System.out.println("Student codes");
        // writes(); // Throws an error because method is non static type
    }
    void writes(){ // Non Static Method or Function
        System.out.println("Student writes");

    }
    void learn(){
        writes();
        System.out.println("Student learn");
    }
}
public class Main{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(191230);
        Student s3 = new Student("Abhinav");
        // System.out.println(s1.count);
        // System.out.println(s2.count);
        // System.out.println(s3.count);
        s1.works();
        Student.works();
        s1.learn();
        Student.codes(); // we dont need to create object for static method or variables
    }
}