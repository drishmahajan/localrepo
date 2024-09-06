package RECURSSION;

public class Stringreverse {
    static String reverse(String str){
        if(str.length()==0){
            return "";
        }
        String samllstring=str.substring(1);
        String small=reverse(samllstring);
        String s=small+str.charAt(0);
        return s;
    }
    static void bul(String org){
        System.out.println(reverse(org).equals(org)?"palindrome":"nope");
    }
    public static void main(String[] args) {
        // System.out.println(reverse("NARAmN"));
        bul("racecar");
    }
}
