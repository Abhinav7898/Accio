import java.util.*;

public class three_sum {
    public static void main(String[] args) {
        int arr[] = {-1,0,1,-4,2,-1};
        List<List<Integer>> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            int first = arr[i];
            int l = i+1;
            int r = n-1;
            while(l<r){
                int sum = first + arr[l] + arr[r];
                if(sum<0){
                    l++;
                }
                else if(sum>0){
                    r--;
                }
                else if(sum==0){
                    list2.add(first);
                    list2.add(arr[l]);
                    list2.add(arr[r]);
                    if(!list1.contains(list2)){
                    list1.add(list2);
                    }
                    System.out.println(list1);
                    System.out.println(list2);
                    list2.clear();
                    System.out.println(list2);
                    r--;
                }
            }
        }
        System.out.println(list1);
    }
}
