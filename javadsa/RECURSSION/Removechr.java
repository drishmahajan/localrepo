package RECURSSION;

public class Removechr {
    static String remove(String s,char search){
        if(s.length()==0){
            return "";
        }
        String smallout=remove(s.substring(1), search);
        if(s.charAt(0)==search){
            return smallout;
        }
        else{
            return s.charAt(0)+smallout;
        }
    }
    public static void main(String[] args) {
        String s="HELLO";
        System.out.println(remove(s,'L'));
    }
}
