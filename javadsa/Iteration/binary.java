public class binary {
    public static void main(String[] args) {
        int num=1000;
        int pow=0;
        int digit=0;
        while (num!=0) {
             digit += (int)Math.pow(2, pow)*num%10;
            pow++;
            num/=10;
        }
        System.out.println(digit);
    }
}
