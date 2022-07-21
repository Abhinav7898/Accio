import java.util.Stack;

public class stack_01{
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        int arr[] = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
        }
        System.out.println(st.peek());
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
        
    }
}