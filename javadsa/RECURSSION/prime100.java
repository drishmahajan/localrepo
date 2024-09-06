package RECURSSION;


public class prime100 {
    static void prime(int num,int count){
        if(count==1){
            System.out.print(num);
            return;
        }
        if(num%count == 0){
            System.out.print(" ");
            return;
        }
        prime(num, count-1);
    }
    static void prime10(int num,int count){
        if(count==1){
            return;
        }

        prime(count, count-1);
        prime10(num,count-1);
    }
    public static void main(String[] args) {
        int num=100;
        prime10(num,num-1);
    }
}
