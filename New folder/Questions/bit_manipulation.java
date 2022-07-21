import java.util.Stack;

public class bit_manipulation {
    public static void main(String[] args){
        // int a = 0111;
        int a = 100;
        String t = "100";
        int n = t.length()-1;
        int tem = n;
        Stack<Integer> st = new Stack<>();
        double sum = 0;
        int count = 0;
        int i = 0;
        while(tem>=0){
            int ans =  t.charAt(n-i);
            i++;
            int temp = Character.getNumericValue(ans);
            if(temp==1){
            sum = sum+Math.pow(2, count);
            count++;
            }
            else{
                count++;
            }
            // a = a/10;
            tem--;
        }
        System.out.println(sum);
        // while(!st.isEmpty()){
        //     System.out.print(st.pop());
        // }
        // int b = a>>1;
        // System.out.println(b);
    }
}
