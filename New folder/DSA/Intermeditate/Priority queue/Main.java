import java.util.PriorityQueue;

public class Main{
    public static void main(String[] args) {
        PriorityQueue<Long> q = new PriorityQueue<>();
        int n = 5;
        long arr[] = {5,4,3,2,1};
        for(int i=0;i<n;i++){
            q.add(arr[i]);
        }
        System.out.println(q);
        long ans = 0;
        while(q.size() >1){
            long a = q.poll();
            long b = q.poll();
            ans += a+b;
            q.add(a+b);
        }
    }
}