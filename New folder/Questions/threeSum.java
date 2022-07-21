public class threeSum {
        public static void main(String[] args) {
            int arr[] = {1,2,3,4,5};
            int tar = 11;
            int n = arr.length;
            int count = 0;               
                for(int i=0;i<n-2;i++){
                    int l = i+1;
                    int r = n-1;
                    int first = arr[i];
                while(l<r){
                    int sum = arr[l] + arr[r]+first; 
                    if(sum==tar && l!=i && r!=i){
                        count++;
                        System.out.println(arr[i]+" "+arr[l]+" "+arr[r]);
                        r--;
                    }
                    else if(sum>tar){
                        r--;
                    }
                    else{
                        l++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    

