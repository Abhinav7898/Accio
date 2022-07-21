public class Merge_sort_1 {
    public static void merge(int arr[],int l,int mid,int r){
        int temp[] = new int[r-l+1];
        int i=0, m = l,n = mid+1;
        while(m<=mid && n<=r){
            if(arr[m]>arr[n]){
                temp[i] = arr[n];
                n++;
                i++;
            }
            else{
                temp[i] = arr[m];
                i++;
                m++;
            }
        }
        while(m<=mid){
            temp[i] = arr[m];
            m++;
            i++;
        }
        while(n<=r){
            temp[i] = arr[n];
            n++;
            i++;
        }
        for(int t = l;t<=r;t++){
            arr[t] = temp[t-l];
        }
    }
    public static void partion(int arr[],int l,int r){
        if(l<r){
        int mid = (l+r)/2;
        partion(arr, l, mid);
        partion(arr, mid+1, r);
        merge(arr,l,mid,r);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int l = 0;
        int r = arr.length-1;
        partion(arr,l,r);
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
