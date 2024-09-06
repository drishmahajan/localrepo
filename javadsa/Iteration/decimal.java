public class decimal {
    public static void main(String[] args) {
        
        int num=8;
        String decimal="";
        while(num!=0){
            decimal=num%2 + decimal;
            num/=2;
        }
        System.out.println(decimal);
    }

}
