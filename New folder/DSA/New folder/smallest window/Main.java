import java.util.HashMap;

public class Main{
    public static void main(String[] args) {
        String s = "bulbulllock";
        String t = "bull";
        HashMap<Character,Integer> hm1 = new HashMap<>();
        int n = s.length();
        int m = t.length();
        for(int i=0;i<m;i++){
            char ch = t.charAt(i);
            hm1.put(ch,hm1.getOrDefault(ch, 0)+1);
        }

        HashMap<Character,Integer> hm2 = new HashMap<>();
        int j = 0;
        int count = 0;
        int max = Integer.MAX_VALUE;
        int l = 0;
        int r = 0;
        System.out.println(hm1);
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(hm1.containsKey(ch)){
            hm2.put(ch,hm2.getOrDefault(ch, 0)+1);
            }
            if(hm1.containsKey(ch)){
                if(hm1.get(ch)==hm2.get(ch)){
                    count++;
                }
            }
            if(count==hm1.size()){
                while(j<=i && hm1.size()==hm2.size()){
                    char temp = s.charAt(j);
                    // System.out.println(hm2+" "+i);
                    if(hm1.containsKey(temp)){
                        max = Math.min(max, i-j);
                        if(hm2.get(temp)==0){
                            hm2.remove(temp);
                                count--;
                                l = j-1;
                                r = i+2;
                                break;
                            }
                        if(hm2.get(temp)==1){
                            hm2.remove(temp);
                            count--;
                            l = j;
                            r = i+1;
                            break;
                            }
                        }
                        if(hm1.containsKey(temp)){
                            hm2.put(temp,hm2.getOrDefault(temp,0)-1);
                        }
                        j++;
                    }
            }
        }
        System.out.println(s.substring(l, r));
    }
}