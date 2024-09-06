/*Anagram
 * silent
 * listen
 */
/* professor and parties in gfg PRACTICE */

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
         int num=1314445;
        // int hash[]=new int[10];
        // while(num!=0){
        //     int digit=num%10;
        //     hash[digit]++;
        //     num/=10;
        // }
        // System.out.println(hash.length);
        // for(int i=0;i<hash.length;i++){
        // if (hash[i]>0) {
        //     System.out.println(" "+i+"->"+hash[i]);
        // }
        // }
        HashMap<Integer,Integer>map=new HashMap<>();
        while(num!=0){
            int digit=num%10;
            if(map.get(digit)==null){
                map.put(digit,1);
            }
            else{
                int count=map.get(digit);
                map.put(digit,count+1);
            }
            num=num/10;
        }
        System.out.println(map);
    }
}
