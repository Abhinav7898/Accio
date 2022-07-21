class change{
    private int a;
    public void setA(int a){
        this.a = a;
    }
    public int getA(){
        return this.a;
    }
}

public class getter_setter {
    public static void main(String[] args) {
        change c1 = new change();
        c1.setA(5);
        System.out.println(c1.getA());
    }
}
