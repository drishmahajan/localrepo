package RECURSSION;

public class sumofno {
    static int sum(int num){
        if(num==0){
            return 0;
        }
        int sm=sum(num/10);
        return sm+num % 10;
    }
    public static void main(String[] args) {
        System.out.println(sum(123));
    }
}
//head wala int
//void wala tail