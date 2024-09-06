public class flip {
    public static void main(String[] args) {
        
        int num=32145;
        // int count = (int) (Math. log10(num) + 1);
        int rev=0;
        int pos=1;
        while(num!=0){
            int coun=num%10;
            rev+= Math.pow(10,coun-1)*pos;
            num/=10;
            pos++;
        }
        System.out.println(rev);
    }
}
