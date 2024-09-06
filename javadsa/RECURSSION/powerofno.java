package RECURSSION;

public class powerofno {
    // static int power(int num,int pow){
    //     if(pow==0){
    //         return 1;
    //     }
    //      return num*power(num, pow-1);
    // }
    // public static void main(String[] args) {
    //     System.out.println(power(2,3));
    // }
    static void power(int num,int pow,int ans){
        if(pow==0){
            System.out.println(ans);
            return;
        }
        ans*=num;
        power(num, pow-1, ans);
    }
    public static void main(String[] args) {
        power(2,3,1);
    }
}
