import java.util.HashMap;

public class hashing_04 {
    public static void main(String[] args) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        int arr[] = {1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i], i);
        }
        // System.out.println( hm.get(1));
        // System.out.println(hm.containsKey(0));
        // System.out.println(hm.containsValue(6));
        // System.out.println(hm.isEmpty());
        // System.out.println(hm.size());
        // System.out.println(hm);
        // hm.remove(1);
        // System.out.println(hm);
        System.out.println(hm.values());
        System.out.println(hm.keySet());
        // hm.clear();
        // int arr1[] = {1,4,4,4,5,6};
        // for(int i=0;i<arr1.length;i++){
        //     hm.put(arr1[i],hm.getOrDefault(arr1[i], 0)+1);
        // }
        // System.out.println(hm.keySet());
        // System.out.println(hm.size());
        // int arrr[] = {1,2,3,4,5,6};
        // System.out.println(hm.keySet());
        // for(int i=0;i<arrr.length;i++){
        //     if(hm.containsKey(arrr[i])){
        //         hm.put(arrr[i],hm.getOrDefault(arr[i], 0)-1);
        //     }
        // }
        // System.out.println(hm);
        // System.out.println(hm.keySet());
        // for(int temp: hm.keySet()){
        //     System.out.print(temp+" ");
        // }
    }
}
