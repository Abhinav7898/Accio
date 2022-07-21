import java.util.*;
import java.lang.*;
import java.io.*;

// Pre order = Root Left Right
public class Main{
    Node root;
    class Node{
        int data;
        Node left;
        Node right;
        Node(int val){
            data=val;
            left=null;
            right=null;
        }
    }
    Main(){
        root=null;
    }
    public static void main (String[] args) throws java.lang.Exception
	{
		//your code here\
      Scanner sc=new Scanner(System.in);
        Main tree=new Main();
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            tree.insert(sc.nextInt());
        }
        tree.preOrder(tree.root);
	}
    public void insert(int data){
        Node newNode = new Node(data);

        if(root ==  null){
            root = newNode;
            return;
        }
        else{
            Node current = root;
            Node parent = null;

            while(true){
                parent = current;
                //If data is less than current's data, node will be inserted
                //to the left of the tree
                if(data< current.data){
                    current = current.left;
                    if(current == null){
                        parent.left = newNode;
                        return;
                    }
                }else{
                    current = current.right;
                    if(current == null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
    public void preOrder(Node root){
        if(root == null ){
            System.out.println(0);
            return;
        }
        preOrderFun(root);
    }
    public void preOrderFun(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrderFun(root.left);
        preOrderFun(root.right);
    }
}