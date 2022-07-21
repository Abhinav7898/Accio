import java.util.ArrayList;
import java.util.Arrays;

/*
Input : 10 12 15 12 10 25 12
Output : 1.5, 4.0, 6.0, 4.0, 1.5, 7.0, 4.0
 */

public class Main{
    public static void main(String[] args) {
        int arr[] = {10, 12, 15, 12, 10, 25, 12};
        Arrays.sort(arr);
        int n = arr.length;
        ArrayList<Double> list = new ArrayList<>();
        for(int i=0;i<n-1;i++){
            boolean flag = false;
            int st = i+1;
            int sum = 0;
            int count = 1;
            while(arr[i]==arr[i+1]){
                sum = sum+i;
                count++;
                i++;
                flag = true;
            }
            if(flag){
                if(count>=2){
                    sum = sum-1;
                }
                double temp1 = st;
                double temp2 = i+1;
                double temp3 = count;
                double temp = (temp1+temp2+sum)/temp3;
                st= st-1;
                System.out.println(temp1+" "+temp2+" "+sum+ " "+count);
                for(int j=st;j<=i;j++){
                    list.add(temp); 
                }
            }
            else{
                double temp = st;
                list.add(temp);
            }
        }
        System.out.println(list);
        // for(int i=0;i<n-1;i++){
        //     System.out.print(list.get(i)+" ");
        // }
    }
}