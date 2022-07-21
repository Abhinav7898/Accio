public class temp {
    public static void main(String[] args) {
        int a = 1234;
        int b = 0;
        while(a>0){
            int temp = a%10;
            b = b*10+temp;
            a = a/10;
        }
        System.out.println(b);

    }
}
