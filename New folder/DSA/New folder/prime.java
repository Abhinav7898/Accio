public class prime {
    public static void main(String[] args) {
        int n = 100;
        System.out.print("Prime No.are: ");
        for(int j=2;j<=n;j++){
            boolean flag = true;
        for(int i = 2;i<=j-1;i++){
            if(j%i==0){
                flag = false;
                break;
            }
        }
        if(flag==true){
            System.out.print(j+" ");
        }
        }
        System.out.println("no");
    }
}
