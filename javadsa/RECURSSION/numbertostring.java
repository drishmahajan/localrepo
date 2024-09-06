package RECURSSION;

public class numbertostring {
    static String numbers[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    static String number(int num){
        if(num==0){
            return "";
        }
        String str=number(num/10);
        return str+numbers[num%10]+" ";

    }
    public static void main(String[] args) {
        System.out.println(number(935));
    }
}
