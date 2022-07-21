/*
class Solution{
    //Function to sort the given linked list using Merge Sort.
    public static Node getMiddle(Node head){
        Node tort = head;
        Node hare = head;
        while(hare.next!=null && hare.next.next!=null){
            tort = tort.next;
            hare = hare.next.next;
        }
        return tort;
    }
    public static Node merge(Node head1,Node head2){
        Node newNode = new Node(-1);
        Node temp = newNode;
        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                temp.next = head1;
                head1 = head1.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        while(head1!=null){
            temp.next = head1;
            temp = temp.next;
            head1 = head1.next;
        }
        while(head2!=null){
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
        }
        return newNode.next;
    }
    static Node mergeSort(Node head){
        // add your code here
        if(head==null || head.next==null){
            return head;
        }
        Node middle =  getMiddle(head);
        Node head2 = middle.next;
        middle.next = null;
        Node newHead1 = mergeSort(head);
        Node newHead2 = mergeSort(head2);
        Node finalHead = merge(newHead1,newHead2);
        return finalHead;
    }
}
*/