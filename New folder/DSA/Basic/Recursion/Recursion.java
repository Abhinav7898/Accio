import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recursion {
    public static ArrayList addNumber(int num,int n){
        ArrayList<Integer> list = new ArrayList<>();
        if(n==0){
            list.add(1);
            return list;
        }
        list =  addNumber(num, n-1);
        list.add(n);
        return list;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ArrayList<Integer> list = new ArrayList<>();
        int num = sc.nextInt();
        int n = 10;
        ArrayList<Integer> ans = addNumber(num,n);
        System.out.println(ans);
        
    }
}
