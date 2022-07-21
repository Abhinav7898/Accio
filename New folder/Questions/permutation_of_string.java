import java.util.*;
import java.lang.*;
import java.io.*;

public class permutation_of_string{
  public static void printPermutation(String str,String permutation){
   
     if(str.length()==0)
     {
       System.out.println(permutation);
       return;
     }
    for(int i = 0;i<str.length();i++){
       char currChar = str.charAt(i);
      //abc= "bc"
       String newstr =  str.substring(0,i)+str.substring(i+1);
      printPermutation(newstr,permutation+currChar);
    }
  }
	public static void main (String[] args) throws java.lang.Exception
	{
      Scanner Scan = new Scanner(System.in);
      String str = Scan.next();
      printPermutation(str,"");
	}
}
