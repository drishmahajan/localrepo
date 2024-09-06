package RECURSSION;

public class Rope {
    public static int maxcut(int ropelength,int a,int b, int c){
        if(ropelength==0){
            return 0;
        }
        if(ropelength<0){
            return -1;
        }
        int cuta=maxcut(ropelength-a, a, b, c);
        int cutb=maxcut(ropelength-b, a, b, c);
        int cutc=maxcut(ropelength-c, a, b, c);
        int max=Math.max(cuta, Math.max(cutb, cutc));
        if(max==-1) return -1;
        return max+1;
    }
    public static void main(String[] args) {
        int ropelegth=3;
        int a=2;
        int b=1;
        int c=3;
        System.out.println(maxcut(ropelegth, a, b, c));
    }
}
