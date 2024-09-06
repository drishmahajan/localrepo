package RECURSSION;

public class josephus {
    static int joseph(int n,int k){
        if(n==1)return 0;
        return (joseph(n-1,k)+k)%n;
    }
    public static void main(String[] args) {
        System.out.println(joseph(5, 3)+1);
    }
}
