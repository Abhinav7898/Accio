import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        int arr[] = {1,2,5,4,1};
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i%n]){
                st.pop();
            }
            if(i<n){
            if(st.isEmpty()){
                ans[i%n] = -1;
            }
            else{
                ans[i%n]  =st.peek();
            }
        }
            st.push(arr[i%n]);
            System.out.print(st.peek()+" ");
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}