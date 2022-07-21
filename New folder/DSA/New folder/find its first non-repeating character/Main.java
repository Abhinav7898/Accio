import java.util.HashMap;

public class Main{
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        HashMap<Character,Integer>hm = new HashMap<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<n;i++){
            if(hm.get(s.charAt(i))==1){
                System.out.println(s.charAt(i));
                break;
            }
        }
        

    }
}