// import java.math.BigInteger;
import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for(int i=1;i<6;i++){
            st.push(i);
        }   
        System.out.println(st);
        java.math.BigInteger b = new java.math.BigInteger("123454545456454512124548487451231245645");
        java.math.BigInteger c = new java.math.BigInteger("123454545454654648854215421245548942121");
        b = b.multiply(c);
        System.out.println(b);
    }
}