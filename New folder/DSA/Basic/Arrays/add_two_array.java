import java.util.Stack;

public class add_two_array {
    public static void main(String[] args) {
        int arr1[] = {9,9};
        int arr2[] = {999};
        int n = arr1.length;
        int m = arr2.length;
        int min = Math.max(n,m);
        Stack<Integer> st = new Stack<>();
        int carry = 0;
        int t = arr1.length-1;
        int q = arr2.length-1;
        while(t>=0 && q>=0){
            int add = arr1[t]+arr2[q]+carry;
            if(add>9){
                int ans = add%10;
                st.push(ans);
                carry = add/10;
            }
            else{
                carry = 0;
                st.push(add);
            }
            t--;
            q--;
        }
        // System.out.println(st);
        while(t>=0){
            int add = arr1[t]+carry;
            if(add>9){
                int ans = add%10;
                st.push(ans);
                carry = add/10;
            }
            else{
                carry = 0;
                st.push(add);
            }
            t--;
        }
        while(q>=0){
            int add = arr2[q]+carry;
            if(add>9){
                int ans = add%10;
                st.push(ans);
                carry = add/10;
            }
            else{
                carry = 0;
                st.push(add);
            }
            q--;
        }
        if(carry>0){
            st.push(carry);
        }
        // System.out.println(carry);
        while(!st.isEmpty()){
        System.out.print(st.peek());
        st.pop();
        }
    }    
}
