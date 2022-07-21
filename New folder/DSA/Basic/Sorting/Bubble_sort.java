public class Bubble_sort{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        for(int i=0;i<n;i++){
            boolean flag  = true;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag  = false;
                }
            }
            if(flag==true){
                break;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}