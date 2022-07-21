class Node{
    int val;
    Node next;
    Node (int val){
        this.val = val;
        this.next = null;
    }
}
public class Main{
    public static Node rotateNodes(Node head){
        Node pre = null;
        while(head!=null){
            Node temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }
    public static void main(String[] args) {
        Node head = new Node(0);
        Node curr = head;
        for(int i=1;i<=5;i++){
            Node currNode = new Node(i);
            curr.next = currNode;
            curr = curr.next;
        }
        Node ans = rotateNodes(head);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans = ans.next;
        }
    }
}