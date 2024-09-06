import java.util.HashMap;

class Anagram {
    public static void main(String[] args) {
        // int[] arr = {1,2, 2, 3};
        
        // for (int i = 0; i < arr.length; i++) {
            //     int digit = arr[i];
            //     if (map.containsKey(digit)) {
                //         map.put(digit, map.get(digit) + 1);
                //         System.out.println("BOYS");
                //         return;
                //         }
                //     else {
                    //         map.put(digit, 1);
                    //     }
                    // }
                    // System.out.println("GIRLS");
                    String a="sIlent";
                    String b="liSten";
                    String x =a.toLowerCase();
                    String y=b.toLowerCase();
                    if(x.length()!=y.length()){
                        System.out.println("no ana");
                        return;
                    }
                    HashMap<Character,Integer> map = new HashMap<>();
                    for(char i:y.toCharArray()){
                map.put(i,map.getOrDefault(i,0)+1);
        }
        for(char i:x.toCharArray()){
            if(map.containsKey(i)){
                System.out.println("anagram");
                return;
            }
                map.put(i,map.get(i)-1);
                if(map.get(i)==0)map.remove(i);
        }
        
}}
