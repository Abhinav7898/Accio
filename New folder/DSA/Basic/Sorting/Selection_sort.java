public class Selection_sort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,6};
        int n=arr.length;
        int mini;
        for(int i=0;i<n;i++){
            mini = i;
            for(int j=i+1;j<n;j++){
                if(arr[mini]>arr[j]){
                    mini = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
       
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
