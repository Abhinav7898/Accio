import java.util.*;
import java.lang.*;
import java.io.*;

public class Remove_outermost_parenthesis{
	public static void main (String[] args){
		//your code here
      Scanner sc = new Scanner (System.in);
      int n = 18;
    //   String s = sc.next();
      String s = "(()())(())(()(()))";
      Stack<Character> st  = new Stack<>();
      StringBuilder str = new StringBuilder();
      int start = 0;
      int end = 0;
      boolean flag = false;
      for(int i=0;i<n;i++){
        char temp = s.charAt(i);
        if(flag==false && temp=='('){
          start = i;
          flag = true;
        }
        if(temp=='('){
          st.push(temp);
        }
        else if(temp==')'){
          st.pop();
        }
        if(st.isEmpty()){
          end = i;
          str = str.append(s.substring(start+1,end));
          flag = false;
        }
      }
      System.out.print(str);
	}
}