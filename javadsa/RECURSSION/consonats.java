package RECURSSION;

public class consonats {
    static void string(String s,int count,int en){
        if(en==s.length()){
            System.out.println(s.length()-count);
            return;
        }
        char ch=s.charAt(en);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
           count++;
        }
        en++;
        string(s, count, en);

    }    public static void main(String[] args) {
        String s="abcdefghijklmnopqrstuvwxyz";
        string(s,0,0);
    }
}
