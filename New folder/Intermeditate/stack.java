import java.util.*;
public class stack{
    public static void printStack(Stack<Integer>st,Stack<Integer>st1){
        if(st.isEmpty()){
            return;
        }
        int temp = st.pop();
        st1.push(temp);
        // System.out.print(temp+" ");
        printStack(st,st1);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        for(int i=1;i<=10;i++){
            st.push(i);
        }
        System.out.println(st1);
        printStack(st,st1);
        // System.out.println();
        // System.out.println(st);
        System.out.println(st1);
        // System.out.println(st);
        // int temp = st.peek();    
        // System.out.println(st);
        // System.out.println(temp);
        // temp = st.pop();
        // System.out.println(temp);
        // System.out.println(st);
        // System.out.println(st.get(0));
    }
}