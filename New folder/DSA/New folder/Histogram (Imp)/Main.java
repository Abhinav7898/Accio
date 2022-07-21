import java.util.Stack;

public class Main{
    public static int[] leftSide(int arr[],int n){
        int left[] = new int [n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                left[i] = -1;
            }
            else{
                left[i] = st.peek();
            }
            st.push(i);
        }
        return left;

    }
    public static int[] rightSide(int arr[],int n){
        int right[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                right[i] = n;
            }
            else{
                right[i] = st.peek();
            }
            st.push(i);
            }
        return right;
    }
    public static void main(String[] args) {
        int n = 7;
        int arr[] = {6,2,5,4,5,1,6};
        int left[] = leftSide(arr,n);
        int right[] = rightSide(arr,n);
        int max = 0;
        for(int i=0;i<n;i++){
            int temp = arr[i]*(right[i]-left[i]-1);
            max = Math.max(max,temp);
        }
        System.out.println(max);
    }
}