import java.util.*;

public class Main{
	public static void main (String[] args){
		//your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int first = -1;
      for(int i=2;i<n;i++){
        boolean flag1 = false;
        for(int j=2;j<i;j++){
          if(i%j==0){
            flag1 = true;
            break;
          }
        }
        if(flag1){
          continue;
        }
        else{
          first = i;
          int  temp = n - first;
          boolean flag2 = false;
          for(int j=2;j<temp;j++){
            if(temp%j==0){
              flag2 = true;
              break;
            }
          }
          if(flag2){
            continue;
          }
          else{
            System.out.print(first+" "+temp);
            break;
          }
        }
      }
	}
}