public class dec_to_bin {
    public static void main(String[] args){
        int n = 5;
        int ans = 0;
        int sum = 0;
        while(n>0){
            int temp  = n%2;
            sum = ans*10*temp;
            ans = 10;
            n = n/2;
        }
        System.out.println(sum);
    }
}
