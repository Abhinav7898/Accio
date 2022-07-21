class OverLoading{
    static int sum(int a,int b){ // 1
        return a+b;
    }
    static int sum(int a,int b,int c){ // 2
        return  a+b+c;
    }
    static double sum(int a,double b){ // 3
        return a+b;
    }
    static double sum(double a,double b){ // 4
        return a+b;
    }
}

public class Main{
    public static void main(String[] args) {
        System.out.println(OverLoading.sum(5,10));         // 1
        System.out.println(OverLoading.sum(5,10,15));   // 2
        System.out.println(OverLoading.sum(5,10.5));      // 3
        System.out.println(OverLoading.sum(5.5,10.5));    // 4
    }
}