class Node{
    int val;
    Node next;
    Node (int val){
        this.val = val;
        this.next = null;
    }
}
public class Main{
    public static boolean isEqual(Node head1,Node head2){
        Node curr1 = head1;
        Node curr2 = head2;
        while(curr1!=null && curr2!=null){
            if(curr1.val!=curr2.val){
                return false;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        if(curr1==null && curr2==null){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,4,5,6,8};
        Node head1 = new Node(arr1[0]);
        Node head2 = new Node(arr2[0]);
        Node curr1 = head1;
        Node curr2 = head2;
        if(head1==null || head2==null){
            System.out.println("Yes");
            return;
        }
        for(int i=1;i<arr1.length;i++){
            Node currNode = new Node(arr1[i]);
            curr1.next = currNode;
            curr1 = curr1.next;
        }
        for(int i=1;i<arr2.length;i++){
            Node currNode = new Node(arr2[i]);
            curr2.next = currNode;
            curr2 = curr2.next;
        }
        boolean ans = isEqual(head1,head2);
        System.out.println(ans);
    }
}