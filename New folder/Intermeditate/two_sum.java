public class two_sum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int tar = 6;
        int n = arr.length;
        
        for(int i=1;i<=6;i++){
            tar = i;
        int l = 0;
        int r = n-1;
        System.out.print("tar: "+tar+"   ans: ");
        boolean flag = false;
            while(l<r){
                int sum = arr[l]+arr[r];
                if(sum==tar){
                    System.out.print(arr[l]+" "+arr[r]+" ");
                    flag = true;
                    r--;
                    }
                else if(sum>tar){
                    r--;
                    }
                else{
                    l++;
                }
            }
            if(flag==false){
                System.out.print("No element found");

            }
            System.out.println();
        }
    }
}
