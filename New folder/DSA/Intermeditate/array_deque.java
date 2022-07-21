import java.util.ArrayDeque;

public class array_deque{
    public static void main(String[] args) {
        ArrayDeque <Integer> ad = new ArrayDeque<>();
        int arr[] = {1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            ad.addLast(arr[i]);
        }
        // ad.add(7); // Similar as ad.addLast();
        // ad.addFirst(0);
        // System.out.println(ad.peek()); // Similar as ad.peekFirst()
        // System.out.println(ad.peekFirst());
        // System.out.println(ad.peekLast());
        // System.out.println(ad.poll()); // Similar as ad.pollFirst()
        // System.out.println(ad.pollFirst());
        // System.out.println(ad.pollLast());
        // System.out.println(ad.size());
        // System.out.println(ad.isEmpty());
        // System.out.println(ad.contains(3));
        // System.out.println(ad.getFirst()); // Similar as ad.peekFirst()
        // System.out.println(ad.getLast()); // Similar as ad.peekLast()
        // ad.remove(); // Similar as ad.pollFirst();
        // ad.remove(2); // parameter as object and remove that object
        // ad.clear();

        // ad.addLast(5);
        // ad.addLast(5);
        // ad.removeLastOccurrence(5);
        // ad.removeFirstOccurrence(5);
        // ad.push(9); // same as ad.addFirst
        System.out.println(ad);
    }
}