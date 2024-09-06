package RECURSSION;

public class Triangle {
        // static void printrow(int n,int m){
        //     if(n<=0){
        //         return;
        //     }
        //     spaces(n);
        //     star(m*2-1,n);
        //     System.out.println();
        //     printrow(n-1,m+1);
            
        // }
        // static void spaces(int n){
    
        //     if(n<=0){
        //         return;
        //     }
        //     System.out.print(" ");
        //     spaces(n-1);
        // }
        // static void star(int m,int n){
        //     if(m<=0){
        //         return;
        //     }
        //     star(m-1,n);
            
        //         System.out.print("*");
        // }
        // public static void main(String[] args) {
        //     printrow(5,1);
        // }}
        static void printrow(int n,int m){
            if(n<=0){
                return;
            }
            printrow(n-1,m+1);
            spaces(n);
            star(m*2-1,n);
            System.out.println("");
            
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
            
                System.out.print("*");
        }
        public static void main(String[] args) {
            printrow(5,1);
        }}
