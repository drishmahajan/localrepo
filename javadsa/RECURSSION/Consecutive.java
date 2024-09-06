package RECURSSION;

public class Consecutive {
    static String consta(String str,int i){
        if(i==str.length()-1){
            return str;
        }
        if(str.charAt(i)==str.charAt(i+1)){
           return consta(str.substring(0,i+1)+ str.substring(i+2), i);
        }
        else{
            return consta(str, i+1);
         }
        
    }
    public static void main(String[] args) {
    String str="AABBCCCDC";
        System.out.println(consta(str,0));
    }
}
