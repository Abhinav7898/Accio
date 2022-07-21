import java.util.Scanner;

class Node{
    Node left,right;
    int data ;
    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class level_order {
    static Node root = null;
    static Scanner sc = new Scanner(System.in);
    public static Node createTree(int data){
        Node newNode = new Node(data);
        if(root==null){
            root = newNode;
            return root;
        }
        root = new Node(data);
        root.left = createTree(data);
        root.right = createTree(data);
        return root;
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            Node root = createTree(sc.nextInt());
        }
    }
}
