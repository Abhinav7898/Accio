class Animal{
    String name;
    void eat(){
        System.out.println(name+" eat");
    }
    void run(){
        System.out.println(name+" runs");
    }

}
class Student{
    int id;
    String name;
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    void name1(){
        System.out.println("Student name is: "+name);
        id1();
    }
    void id1(){
        System.out.println("Student id is: "+id);
    }
    public void printInfo(){
        System.out.println("Student name: "+this.name);
        System.out.println("Student id: "+this.id);
    }
}
public class Main{
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name = "buzo";
        dog.name = "bruno";
        dog.eat();
        dog.run();
        Animal cat = new Animal();
        cat.name = "Kitte";
        cat.eat();
        Student stu = new Student("Abhinav",191230);
        stu.printInfo();
        stu.name = "Abhinav";
        stu.id = 191230;
        stu.name1();
    }
}