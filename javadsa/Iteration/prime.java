public class prime {
    public static void main(String[] args) {
        int a=27;
        for(int i=2;i*i<=a;i++){
            if(a%i==0){
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("prime");
}
}