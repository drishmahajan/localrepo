public class gcd {
    public static void main(String[] args) {
        int a=22;
        int b=220;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println(a);
    }
}
