package RECURSSION;

public class hex_to_dec{
    //hexa to decimal
     static int toint(int num,int pow,int ans){
        if(num==0){
            return ans;
        }
        ans+=(int)Math.pow(16, pow)*num%10;
         return toint(num/10, pow+1,ans);
    }
    public static void main(String[] args) {
        // int B=11;
        // int C=12;
        // int D=13;
        // int E=14;
        int nu=113810;
        System.out.println(toint(nu,0,0));
    }
}
