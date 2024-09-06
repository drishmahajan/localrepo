package RECURSSION;

public class Prime {
    static void prime(int num,int count){
        if(count==1){
            System.out.println(num);
            return;
        }
        if(num%count == 0){
            System.out.println("not prime");
            return;
        }
        prime(num, count-1);
    }
    public static void main(String[] args) {
        int num=89;
        prime(num,num-1);
    }
}
