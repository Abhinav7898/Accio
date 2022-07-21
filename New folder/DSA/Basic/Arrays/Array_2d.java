public class Array_2d{
    public static void main(String[] args) {
        int arr[][] = new int[3][4];
        int n = arr.length;
        int m = arr[0].length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = count;
                count++;
            }
        }
        int tar = 12;
        int r = m-1;
        for(int i=0;i<n;i++){
            boolean flag = false;
            boolean flag1 = false;
            if(arr[i][r]>=tar){
                int l = 0;
                while(l<=r){
                    int mid = (l+r)/2;
                    if(arr[i][mid]==tar){
                        System.out.print(i+" "+mid);
                        flag = true;
                        break;
                    }
                    else if(arr[i][mid]>tar){
                        r = mid-1;
                    }
                    else{
                        l =  mid+1;
                    }
                }
                if(l>r){
                    System.out.print("No Element Found");
                }
                else if(flag==true){
                    break;
                }
            }
        }
    }
}