package RECURSSION;

public class day2 {
    static void function(int num){
        if(num==0){
            return;
        }
        function(num-1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        function(10);
    }
}
