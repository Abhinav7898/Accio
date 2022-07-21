import java.util.HashMap;

public class count_pair {
    public static void main(String[] args) {
        int  n = 4, k = 2;
        int arr[] = {1,1,1,1};
        // output = 2;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count = 0;
        for(int i=0;i<n;i++){
            if(hm.containsKey(k-arr[i])){
                count = count+hm.get(k-arr[i]);
            }
            hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(count);
    }
}
