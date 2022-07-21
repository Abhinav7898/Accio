import java.util.Scanner;

class Node{
    Node left;
    Node right;
    int  data;
    Node(int data){
        this.data = data;
    }
}
public class Tree{
    static Scanner sc = new Scanner(System.in);
    static Node createTree(){
        Node root = null;
        int data = sc.nextInt();
        if(data==-1){
            return null;
        }
        root = new Node(data);
        root.left = createTree();
        root.right = createTree();
        return root;
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root =  createTree();
        preOrder(root);
    }
}