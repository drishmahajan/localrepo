package RECURSSION;

public class fact {
    // static int function(int n){
    //     if(n==1||n==0){
    //         return 1;
    //     }
    //     return n*function(n-1);
    // }
    // public static void main(String[] args) {
    //     System.out.println(function(5));
    // }
    static void function(int n,int r){
        if(n==1){
            System.out.println(r);
            return;
        }
        function(n-1,n*r);
    }
    public static void main(String[] args) {
        function(5,1);
    }
}
