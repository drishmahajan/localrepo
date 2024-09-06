package RECURSSION;

public class Binary_to_int {
    // static int toint(int num,int pow,int ans){
    //     if(num==0){
    //         return ans;
    //     }
    //     ans+=(int)Math.pow(2, pow)*num%10;
    //      return toint(num/10, pow+1,ans);
        
    // }
    // public static void main(String[] args) {
    //     System.out.println(toint(111,0,0));
    // }
    static void toint(int num,int pow,int ans){
        if(num==0){
            System.out.println(ans);
            return;
        }
        ans+=(int)Math.pow(2, pow)*num%10;
          toint(num/10, pow+1,ans);
        
    }
    public static void main(String[] args) {
        toint(1111,0,0);
    }
}
