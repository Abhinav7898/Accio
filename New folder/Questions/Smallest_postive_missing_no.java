public class Smallest_postive_missing_no {
    public static void main(String[] args) {
        int n = 4;
        int arr[] = {1,2,2,3};
        int res[]= new int[1000000];
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                res[arr[i]]++;
                
            }
        }
        for(int i=1;i<=1000000;i++){
            if(res[i]==0){
                System.out.println(i);
                break;
            }
        }
        // return 1000000;
    }
}
