import java.util.*;

public class queue_02 {
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5};
        // Queue<Integer> qu = new LinkedList<>();
        // for(int i=0;i<5;i++){
        //     qu.add(arr[i]);
        // } 
        // Queue<Integer> qu1 = new LinkedList<>();
        // while(!qu.isEmpty()){
        //     qu1.add(qu.poll());
        // }
        // System.out.println(qu1);
        // System.out.println(qu);
        String t = "11001011011101011011011111001111001101000110010011111010110000100100000000001001011111";
        int count = 0;
        // System.out.println(t.length());
        for(int i=0;i<t.length();i++){
            char temp = t.charAt(i);
            if(temp=='0'){
                count++;
            }
        }
        t = t.replace(" ", "");
        System.out.println(count);
        System.out.println(t.length());
    }
}
