package RECURSSION;

public class mirr_inv_right {
    static void printrow(int n,int m){
        if(n<=0){
            return;
        }
        star(m);
        spaces(n);
        System.out.println();
        printrow(n-1,m+1);
        
    }
    static void spaces(int n){

        if(n<=0){
            return;
        }
        System.out.print("*");
        spaces(n-1);
    }
    static void star(int m){
        if(m<=0){
            return;
        }
        star(m-1);
        System.out.print(" ");
    }
    public static void main(String[] args) {
        printrow(5,1);
    }
}
