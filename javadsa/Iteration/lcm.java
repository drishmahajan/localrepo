public class lcm {
    public static void main(String[] args) {
        int a=2;
        int tor=a;
        int b=4;
        int tor1=b;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println(a);
        int lcm=tor*tor1/a;
        System.out.println(lcm);
    }
}
