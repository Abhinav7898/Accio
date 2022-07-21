public class Main {
    public static void main(String[] args) {
        String arr[] = {"Geek","GfG1"};
        int n = arr.length;
        for(int i=0;i<n;i++){
            String temp = arr[i];
            int num = temp.length();
            int count = 0;
            boolean flag1 = true,flag2 = true,flag3 = true;
            for(int j=0;j<num;j++){
                char t = temp.charAt(j);
                if(t==Character.toUpperCase(t) && flag1 ==true){
                    count++;
                    flag1 = false;
                }
                else if(t==Character.toLowerCase(t)&& flag2 ==true){
                    count++;
                    flag2 = false;
                }
                else if(Character.isDigit(t)&& flag3 ==true){
                    count++;
                    flag3 = false;
                }
            }
            if(count>=3){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
