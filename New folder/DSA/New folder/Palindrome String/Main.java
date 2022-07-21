public class Main{
    public static void main(String[] args) {
        // String s = "abcdcba";
        String s = "geeksforgeeks";
        int n = s.length();
        boolean flag = false;
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                flag = true;
                System.out.println("False");
                break;
            }
        }
        if (!flag){
            System.out.println("True");
        }
    }
}