package RECURSSION;

public class decimal_to_hex {
    // static void tobinary(int num,String s){
    //     if(num==0){
    //         System.out.println(s);
    //         return;
    //     }
    //       s=num%16+s;
    //      tobinary(num/16,s);
    // }
    // public static void main(String[] args) {
    //     tobinary(7562,"");
    // }
    static String tobinary(int num,String s){
        if(num==0){
            return s;
        }
          s=num%16+s;
        return tobinary(num/16,s);
    }
    public static void main(String[] args) {
        System.out.println(tobinary(7562,""));
    }
}
