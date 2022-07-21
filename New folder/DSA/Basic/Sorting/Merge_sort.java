public class Merge_sort{
  public static void partion(int arr[],int l,int r){
        if(l<r){
            int mid = (l+r)/2;
            partion(arr, l, mid);
            partion(arr, mid+1, r);
            merge(arr,l,mid,r);
        }
    }
    public static void merge(int arr[],int l,int mid,int r){
        int arr2[] = new int[r-l+1];
        int i = l,j = mid+1, k = 0;
        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                arr2[k] = arr[i];
                i++;
                k++;
            }
            else{
                arr2[k] = arr[j];
                k++;
                j++;
            }
        }
        while(i<=mid){
            arr2[k] = arr[i];
            k++;
            i++;
        }
        while(j<=r){
            arr2[k] = arr[j];
            k++;
            j++;
        }
        for(k= l;k<=r;k++){
            arr[k] =arr2[k-l];
        }
    }
	public static void main (String[] args){
      int arr[] = {5,4,3,2,1};
        int n = arr.length;
        int l = 0;
        int r = n-1;
        partion(arr,l,r);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
	}
}