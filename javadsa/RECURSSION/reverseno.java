package RECURSSION;

public class reverseno {
    static void reverse(int num,int rev){
        if(num==0){
            System.out.println(rev);
            return;
        }
        rev=rev*10+(num%10);
        reverse(num/10, rev);
    }
    public static void main(String[] args) {
        int num=12345;
        reverse(num,0);
    }
}
