package RECURSSION;

public class armstro {
       static void arms(int org,int sum,int aux,int count){
        if(aux==0){
            if(org==sum){
                System.out.print(org+" ");
            }
            else{
                System.out.print("");
            }
            return;
        }
        count = (int) (Math. log10(org) + 1);
        int singl=aux%10;
        sum+=Math.pow(singl, count);
        aux/=10;
        arms(org, sum, aux, count);
    }
    static void arms1(int org,int count){
        if(org==0){
            return;
        }
        arms(org, 0, org, count);
        arms1(org-1, count);
    }

    public static void main(String[] args) {
        int org=10000;
        int count = (int) (Math. log10(org) + 1);
        arms1(org,count);
    }
    
}
