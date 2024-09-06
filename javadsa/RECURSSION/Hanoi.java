package RECURSSION;

public class Hanoi {
    static int hano(int n,char from,char aux,char to){
        if(n==1){
            System.out.println("move disk 1 from rod "+from+" to rod "+to);
            return 1;
        }
        int count=hano(n-1, from, to, aux);
        System.out.println("move disk "+n+" from rod "+from+" to rod "+to);
        count+=1;
      
       count+=hano(n-1, aux, from, to);
       return count;
    }
    public static void main(String[] args) {
        int countt=hano(3, '1','2','3');
        System.out.println(countt);
    }
}
