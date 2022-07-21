import java.util.Arrays;

public class Largest_number {
    public static void main(String[] args) {
        
        // code here
        int n = 5;
        String arr[] = {"3", "30", "34", "5", "9"};
        Arrays.sort(arr,(x,y)->(y+x).compareTo(x+y)); 
       StringBuilder sb=new StringBuilder();
       for(String x:arr){
           sb.append(x);
       }
    }
}
