package RECURSSION;

public class multiplyno {
    static void multiply(int n1,int n2,int aux1,int aux2,int sum){
        if(n2==0){
            System.out.println(sum);
            return;
        }
        aux1=n1%10;
        aux2=n2%10;
        sum+=aux1*aux2;
        multiply(n1/10, n2/10, aux1, aux2, sum);
    }
    public static void main(String[] args) {
        int n1=36;
        int n2=4532;
        multiply(n1,n2,0,0,0);
    }
}
