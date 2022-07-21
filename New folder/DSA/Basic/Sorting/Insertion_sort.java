public class Insertion_sort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int n = arr.length;
        for(int i = 1; i<n;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current ; 
            for(int k=0;k<n;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
