class Student1{
    String name ;
    int id;
    public void printInfo1(String name){
        System.out.println(name);
    }

    public void printInfo1(int id){
        System.out.println(id);
    }

    public void printInfo1(String name,int id){
        System.out.println(name+" "+id);
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.printInfo1("Abhinav"); // OverLoading
        s1.printInfo1(191230);
        s1.printInfo1("Abhinav",191230);
    }
}
