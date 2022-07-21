public class by_fre_array {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        int n = s.length();
        int fre[] = new int[26];
        for(int i=0;i<n;i++){
            fre[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            System.out.print(fre[i]+" ");
        }

    }
    
}
