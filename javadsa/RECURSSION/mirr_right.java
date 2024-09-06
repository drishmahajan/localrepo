package RECURSSION;

public class mirr_right {
    static void printrow(int n,int m){
        if(n<=0){
            return;
        }
        spaces(n);
        star(m,n);
        System.out.println();
        printrow(n-1,m+1);
        
    }
    static void spaces(int n){

        if(n<=0){
            return;
        }
        System.out.print(" ");
        spaces(n-1);
    }
    static void star(int m,int n){
        if(m<=0){
            return;
        }
        star(m-1,n);
        if(m==1||n==1){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        printrow(5,1);
    }
}
