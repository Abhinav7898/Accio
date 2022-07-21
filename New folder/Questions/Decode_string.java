import java.util.Stack;

public class Decode_string {
    public static void main(String[] args) {
        String s = "3[a2[ab]]";
        Stack<Integer>st1 = new Stack<>();
        Stack<Character>st2 = new Stack<>();
        int n = s.length();
        String res = "";
        String temp = "";
        for(int i=0;i<n;i++){
        int digit = 0;
            if(Character.isDigit(s.charAt(i))){
                while(Character.isDigit(s.charAt(i))){
                    digit = digit*10+s.charAt(i)-'0';
                    i++;
                }
                i--;
                st1.push(digit);
            }
            else if(s.charAt(i)==']'){
                temp = "";
                while(st2.peek()!='['){
                    res = st2.pop()+res;
                }
                st2.pop();
                for(int j=0;j<st1.peek();j++){
                    temp = temp+res;
                }
                st1.pop();
                for(int j=0;j<temp.length();j++){
                    st2.push(temp.charAt(j));
                }
                res = "";
                temp = "";
            }
            else{
                st2.push(s.charAt(i));
            }
        }
        while(!st2.isEmpty()){
            res = st2.pop()+res;
        }
        System.out.println(res);
    }   
}
