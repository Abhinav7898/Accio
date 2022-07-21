public class twosum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int tar = 6;
        int n = arr.length;
        int count = 0;
            int l = 0;
            int r = n-1;
            while(l<r){
                int sum = arr[l] + arr[r]; 
                if(sum==tar){
                    count++;
                    System.out.println(arr[l]+" "+arr[r]);
                    r--;
                }
                else if(sum>tar){
                    r--;
                }
                else{
                    l++;
                }
            }
        System.out.println(count);
    }
}
