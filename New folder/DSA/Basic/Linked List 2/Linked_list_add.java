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
    public static Node addLast(Node head,Node tar){
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = tar;
        return head; 
    }
    public static Node addMiddle(Node head,Node tar){
        Node hare = head;
        Node tort = head;
        while(hare.next!=null && hare.next.next!=null){
            tort = tort.next;
            hare = hare.next.next;
        }
        Node temp = tort.next;
        tort.next =  tar;
        tar.next = temp;
        return head;
    }
    public static Node addElement(Node head,int tar){
        Node curr = head;
        while(curr.next!=null && curr.val!=tar){
            curr = curr.next;
        }
        if(curr.val==tar){
            Node temp = curr.next;
            Node pre = new Node(tar);
            Node newHead = pre;
            Node newCurr = pre;
            for(int i=0;i<4;i++){
                Node curNode = new Node(tar);
                newCurr.next = curNode;
                newCurr = newCurr.next;
            }
            curr.next = newHead;
            newCurr.next = temp;
        }
        return head;
    }
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {1,2,3,4,5,6};
        Node head = new Node(arr[0]);
        Node curr = head;
        for(int i=1;i<n;i++){
            Node currNode = new Node(arr[i]);
            curr.next = currNode;
            curr = curr.next;
        } 
        // Node tar = new Node(3);
        int tar = 3;
        // Add element in linked list
        // Node temp = addFirst(head,tar);
        // Node temp = addLast(head,tar);
        // Node temp = addMiddle(head,tar);
        Node temp = addElement(head,tar);

        // Delete 

        printList(temp);
    }
}
