import java.util.HashMap;

public class by_hash_map{
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        HashMap<Character,Integer> hm = new HashMap<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i), 0)+1);
        }
        HashMap<Character,Integer> hm2 = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!(hm2.containsKey(s.charAt(i)))){
                System.out.print(s.charAt(i)+""+hm.get(s.charAt(i))+" ");
                hm2.put(s.charAt(i),0);
            }
        }
    }
}