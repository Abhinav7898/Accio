package Package2;
import Package1.*;
public class temp extends Main{
   public static void main(String[] args) {
      //  Main m1 = new Main();
      //  m1.fun(); // Error because of protected access modifier
    temp t1 = new temp();
    t1.fun();
   }

}
