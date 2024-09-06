package RECURSSION;

public class palindrome {
    // static void pal(int org,int rev,int aux){
    //     if(aux==0){
    //         if(org==rev){
    //             System.out.println("PALINDROME");
    //         }
    //         else{
    //             System.out.println("not palindrome");
    //         }
    //         return;
    //     }
    //     int single=aux%10;
    //     rev=single+rev*10;
    //     aux/=10;
    //     pal(org, rev, aux);
    // }
    // public static void main(String[] args) {
    //     int num=121;
    //     pal(num, 0, num);
    // }
    static boolean pal(int org,int rev,int aux){
        if(aux==0){
            return org==rev;
        }
        int single=aux%10;
        rev=single+rev*10;
        aux/=10;
        return pal(org, rev, aux);
    }
    public static void main(String[] args) {
        int num=121;
        System.out.println(pal(num, 0, num));
    }
}
