import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int ans = (n-4)/2;
        String t = "";
        for(int i=0;i<ans;i++){
            t = t+s.charAt(i);
        }
        for(int i=ans;i<n-ans;i++){
            t = t+'#';
        }
        for(int i=n-ans;i<n;i++){
            t = t+s.charAt(i);
        }
        System.out.println(t);
    }
}