class Student{
    int id;
    String name;
}

public class Main{
    public static void main(String[] args) {
        Student arr[] = new Student[2]; // Memory allocation for 2 reference variable of student class
        arr[0] = new Student(); // This element is reference to the object of student class
        arr[0].id = 123;
        arr[0].name = "Abhinav";
        System.out.println(arr[0].name+" "+arr[0].id);
    }
}