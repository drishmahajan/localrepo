package RECURSSION;

public class armstrong {
    static void arms(int org,int sum,int aux,int count){
        if(aux==0){
            if(org==sum){
                System.out.println(sum);
            }
            else{
                System.out.println("not armstrong");
            }
            return;
        }
        count = (int) (Math. log10(org) + 1);
        int singl=aux%10;
        sum+=Math.pow(singl, count);
        aux/=10;
        arms(org, sum, aux, count);
    }

    public static void main(String[] args) {
        arms(370,0,370,0);
    }
    // static boolean arms(int org,int sum,int aux,int count){
    //     if(aux==0){
    //         return sum==org;
    //     }
    //     count = (int) (Math. log10(org) + 1);
    //     int singl=aux%10;
    //     sum+=Math.pow(singl, count);
    //     aux/=10;
    //     return arms(org, sum, aux, count);
    // }

    // public static void main(String[] args) {
    //     System.out.println(arms(370,0,370,0)?"palinndrome":"not pal");
    // }
}
