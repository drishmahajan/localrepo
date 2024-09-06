package RECURSSION;

public class hcf {
    static void hcff(int num,int num1){
        if(num1==0){
            System.out.println(num);
            return;
        }
        int temp=num1;
        num1=num%num1;
        num=temp;
        hcff(num, num1);
    }
    public static void main(String[] args) {
        int num=22;
        int num1=20;
        hcff(num,num1);
    }
}
