package RECURSSION;

public class countevenodd {
    // static void Eo(int range,int result[]){
    //     if(range==0){
    //         System.out.println("Even"+result[0]);
    //         System.out.println("odd"+result[1]);
    //         return;
    //     }
    //     if(range%2==0){
    //         result[0]++;
    //     }
    //     else{
    //         result[1]=result[1]+1;
    //     }
    //     Eo(range-1,result);

    // }
    // public static void main(String[] args) {
    //     int count[]=new int[2];
    //     Eo(100,count);
    // }
    static int[] Eo(int range){
        if(range==0){
            int count[]=new int[2];
            return count;
        }
        int cc[]= Eo(range-1);
        if(range%2==0){
             cc[0]++;
        }
        else{
            cc[1]=cc[1]+1;
        }
        return cc;

    }
    public static void main(String[] args) {
        int count[]=Eo(100);
        System.out.println(count[0]);
        System.out.println(count[1]);
        
    }
}
