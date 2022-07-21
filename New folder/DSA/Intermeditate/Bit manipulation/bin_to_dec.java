public class bin_to_dec{
    public static void main(String[] args){
        String s = "00000000110";
        int ans = Integer.parseInt(s);
        System.out.println(ans);
        int sum = 0;
        int t = 0;
        while(ans>0){
            int temp = ans%10;
            sum= sum+(int)(Math.pow(2, t++)*temp);
            ans = ans/10;
        }
        System.out.println(sum);
    }
}