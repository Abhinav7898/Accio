import java.util.Stack;

public class stock_span {
    public static void main(String[] args) {
        // int price[] = {100, 80, 60, 70, 60, 75, 85};
        int price[] = { 68, 735, 101, 770, 525, 279, 559, 563};
        // 1 2 1 3 1 1 3 2 
        // 1 2 1 4 1 1 3 4 correct 
        int  n = 8;
        Stack<Integer> num = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        int count = 1;
        int arr[] = new int[n];
        num.push(price[0]);
        temp.push(1);
        arr[0] = 1;
        for(int i=1;i<n;i++){
            count = 1;
            if(num.peek()>price[i]){
                num.push(price[i]);
                temp.push(1);
                arr[i] = temp.peek();
            }
            else{
                while(!num.isEmpty() && num.peek()<price[i]){
                    num.pop();
                    // temp.pop();
                    count++;
                }
                int t = 0;
                if(!temp.isEmpty()){
                    t = temp.peek();
                }
                num.push(price[i]);
                temp.push(count);
                arr[i] = temp.peek()+t;
                
            }
            System.out.println(num);
            System.out.println(temp);
            System.out.println();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
