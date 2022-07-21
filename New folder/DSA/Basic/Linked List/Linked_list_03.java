import java.util.Scanner;

class Node{
    String name;
    Node next;
    Node(String name){
        this.name = name;
        this.next = null; 
    }
}
public class Linked_list_03{
    public static void printList(Node head){
        Node curr = head;
        if(curr.next==null){
            System.out.print(curr.name+"-->");
            return;
        }
        printList(curr.next);
        System.out.print(curr.name+"-->");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        Node head = new Node(sc.next());
        Node curr = head;
        for(int i=1;i<n;i++){
            Node currNode = new Node(sc.next());
            curr.next = currNode;
            curr = curr.next;
        }
        printList(head);
    }
}