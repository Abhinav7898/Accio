import java.util.Stack;

public class Main_2 {
    public static int [] leftSide(int arr[]){
        int n = arr.length;
        int left[] = new int[n];
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
    public static int [] rightSide(int arr[]){
        int n = arr.length;
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
    public static int maxArea(int arr[]){
        int left[] = leftSide(arr);
        int right[] = rightSide(arr);
        int n = arr.length;
        int max = 0;
        for (int i=0;i<n;i++){
            int ans = arr[i]*(right[i]-left[i]-1);
            if(ans>max){
                max = ans;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[][] = { {1,1,0,1},
                        {1,0,0,1},
                        {1,1,0,1}};
        int n = arr.length;
        int m = arr[0].length;
        int currRow[]= arr[0];
        int max = maxArea(currRow);
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    currRow[j] = 0; 
                }
                else{
                    currRow[j] = currRow[j]+1; 
                }
            }
            int ans = maxArea(currRow);
            if(ans>max){
                max = ans;
            }
        }
        System.out.println(max);
    }
}
