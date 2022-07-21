public class binary_search {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,3,4,5};
        int n = arr.length;
        int sum = 6;
        int l = 0, r = n-1;
        int temp = 0;
        while(l<r){
            if(arr[l]==arr[r] && temp==0){
                System.out.println(arr[l]+" "+arr[r]);
                temp = 1;
                l++;
                r--;
            }
            else if(arr[l]+arr[r] == sum){
                System.out.println(arr[l]+" "+arr[r]);
                r--;
            }
            else if(arr[l]+arr[r]>sum){
                r--;
            }
            else{
                l++;
            }
        }
    }   
}
