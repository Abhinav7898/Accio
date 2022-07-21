package Bank;
  public class Account{
    public String name ;
    public int balance;
   public void printName(){
        System.out.println("Customer name is: "+name);
        printBalance();
    }
    public void printBalance(){
        System.out.println("Customer balance is Rs : "+balance);
    }
public class bank{

    // public static void main(String[] args) {
    //     Account b = new Account();
    //     b.name = "Abhinav";
    //     b.balance = 50000000;
    //     b.printName();

    }
}