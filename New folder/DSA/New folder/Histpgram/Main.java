import java.util.Stack;

public class Main{
    public static int[] leftSide(int arr[]){
        int n = arr.length;
        int left[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.empty()){
                left[i] = -1;
            }
            else{
                left[i] = st.peek();
            }
            st.push(i);
        }
        return left;
    }
    public static int[] rightSide(int arr[]){
        int n = arr.length;
        int right[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.empty()){
                right[i] = n;
            }
            else{
                right[i] = st.peek();
            }
            st.push(i);
        }
        return right;
    }

    public static int maxArea(int arr[]){
        int left[] = leftSide(arr);
        int right[] = rightSide(arr);
        int n = arr.length;
        int max = 0;
        for(int i=0;i<n;i++){
            int ans = (arr[i])*(right[i]-left[i]-1);
            if(ans>max){
                max = ans;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int ans = maxArea(arr);
        System.out.println(ans);
    }
}