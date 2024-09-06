package RECURSSION;

public class day1 {
    static void recursion(int num){
        if(num==0){
            return;
        }
        System.out.println("wow");
        recursion(num-1);
    }
    public static void main(String[] args) {
        recursion(5);
    }
}
