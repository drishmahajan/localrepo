package RECURSSION;

public class multi {
        // static void trees(int n){
        //     if(n<=0){
        //         return;
        //     }
        //     System.out.println("pre:"+n);
        //     trees(n-1);
        //     System.out.println("mid:"+n);
        //     trees(n-2);
        //     System.out.println("post:"+n);
        // }
        // public static void main(String[] args) {
        //     trees(3);
        // }
        static int fib(int n){
        if(n<2){
            return n;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
        }
        public static void main(String[] args) {
            System.out.println(fib(5));
        }
    }
