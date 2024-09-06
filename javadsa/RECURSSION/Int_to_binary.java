package RECURSSION;

public class Int_to_binary {
    // static String tobinary(int num){
    //     if(num==0){
    //         return "";
    //     }
    //     String ans=tobinary(num/2);
    //     ans+=num%2;
    //     return ans;
    // }
    // public static void main(String[] args) {
    //     System.out.println(tobinary(8));
    // }
    static void tobinary(int num,String s){
        if(num==0){
            System.out.println(s);
            return;
        }
          s=num%2+s;
         tobinary(num/2,s);
    }
    public static void main(String[] args) {
        tobinary(8,"");
    }
}
