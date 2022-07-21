public class first_occurance {
    public static void main(String[] args) {
        int arr[] = {1,2,2,4};
        int k = 3;
        int n = arr.length;
        int l = 0;
        int r = n-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==k){
                if(mid==0 || arr[mid-1]<k){
                    System.out.println(mid);
                    // break;
                    return;
                }
                else{
                    r = mid;
                }
            }
            else if(arr[mid]>k){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        System.out.println(-1);

    }    
}
