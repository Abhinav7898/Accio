import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "news";
        int ans = 1;
        int n = s.length();
        if(n%2!=0){
            System.out.println(false);
            return;
        }
        int i=1;
        for(;i<n-1;i+=2){
            char temp = s.charAt(i);

            System.out.println(temp);
            if(temp=='n' && s.charAt(i+1)=='s'){
                ans = ans+1;
            }
            else if(temp=='s'&& s.charAt(i+1)=='n'){
                ans = ans-1;
            }
            else if(temp=='e'&& s.charAt(i+1)=='w'){
                ans = ans+1;
            }
            else if(temp=='w' && s.charAt(i+1)=='e'){
                ans = ans-1;
            }
            else{
                ans = ans+1;
            }
        }
        System.out.println(s.charAt(i));

        System.out.println(ans);
        if(s.charAt(i-1)=='n' && s.charAt(i)=='s'){
            ans = ans+1;
        }
        if(s.charAt(i-1)=='s' && s.charAt(i)=='n'){
            ans = ans-1;
        }
        if(s.charAt(i-1)=='e' && s.charAt(i)=='w'){
            ans = ans+1;
        }
        if(s.charAt(i-1)=='w' && s.charAt(i)=='e'){
            ans = ans-1;
        }
        if(ans==0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
