class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}
public class Linked_list_add {
    public static void printList(Node head){
        Node curr = head;
        if(curr.next==null){
            System.out.print(curr.val);
            return;
        }
        System.out.print(curr.val+"-->");
        printList(curr.next);
        
    }
    public static Node addFirst(Node head,Node tar){
        tar.next = head;
        head = tar;
        return head;

    }
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1,2,3,4,5};
        Node head = new Node(arr[0]);
        Node curr = head;
        for(int i=1;i<n;i++){
            Node currNode = new Node(arr[i]);
            curr.next = currNode;
            curr = curr.next;
        } 
        Node tar = new Node(6);
        Node temp = addFirst(head,tar);
        printList(temp);
    }
}
