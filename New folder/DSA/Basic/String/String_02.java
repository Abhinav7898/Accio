public class String_02 {
    public static void main(String[] args) {
        String name = "abhinav";
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(0,4));
        String temp = name.replace("a", "p"); 
        System.out.println(temp);
        temp = name.replaceFirst("a", "p");
        System.out.println(temp);
        char arr[] = name.toCharArray();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(name.startsWith("a"));
        System.out.println(name.endsWith("v"));
        String num = "12";
        int n = Integer.parseInt(num);
        System.out.println(n);
        n = 10;
        num = Integer.toString(n);
        System.out.println(num);
        String name1 = "jain";
        System.out.println(name);
        if(name.compareTo(name1)==0){
            System.out.println("yes");
        }
        else if(name.compareTo(name1)>0){
            System.out.println("Name is greater");
        }
        else{
            System.out.println("Name1 is greater");
        }
        name1 = name;
        if(name.equals(name1)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        String  t1 = "john";
        String t2 = "johny";
        if(t1.compareTo(t2)>0){
            System.out.println(t1);
        }
        else{
            System.out.println(t2);
        }
    }
}
