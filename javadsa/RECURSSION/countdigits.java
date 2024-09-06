package RECURSSION;

import java.util.HashMap;

public class countdigits {
    static void count(int num,HashMap<Integer,Integer> map){
       if(num==0){
        System.out.println(map);
        return;
       }
       
       int digit=num%10;
        if(map.get(digit)==null){
            map.put(digit,1);
        }
        else{
            int count=map.get(digit);
            map.put(digit,count+1);
        }
        count(num/10,map);
    }
    public static void main(String[] args) {
        int num=1211;
        HashMap<Integer,Integer> map = new HashMap<>();
        count(num,map);
    }
}
