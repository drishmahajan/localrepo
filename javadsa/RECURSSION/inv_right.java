package RECURSSION;

public class inv_right {
    static void printrow(int n){
        if(n<=0){
            return;
        }
        printrow(n-1);
        right(n);
        System.out.println();

    }
    static void right(int n){
        if(n<=0){
            return;
        }
        System.out.print("*");
        right(n-1);
    }
    // static String star(String str,int i){
    //     if(i==0){
    //         return str;
    //     }
    //    return star(str, i--);
    // }
    public static void main(String[] args) {
        printrow(5);
        //star("*",5);
    }
}
