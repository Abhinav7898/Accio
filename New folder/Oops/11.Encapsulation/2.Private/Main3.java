class Pvt{
    private int a;
    public void setA(int a,boolean isAdmin){
        if(isAdmin){
            this.a = a;
        }
        else{
            System.out.println("You are not allowed");
        }
    }
    boolean isAdmin(String name){
        if(name.equals("Abhinav") || name.equals("Hritika")){
            return true;
        }
        return false;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Pvt p1 = new Pvt();
        p1.setA(5, p1.isAdmin("Abhinav"));
        
    }
}
