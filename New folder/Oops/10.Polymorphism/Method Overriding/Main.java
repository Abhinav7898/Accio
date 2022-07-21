class Animal{
    void sound(){
        System.out.println("Animal creates sound");
    }
}
class Lion extends Animal{
    @Override
    void sound(){
        System.out.println("Lion roars");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

public class Main{
    public static void main(String[] args) {
        Lion shera = new Lion();
        shera.sound();

        Dog k = new Dog();
        k.sound();
    }
}