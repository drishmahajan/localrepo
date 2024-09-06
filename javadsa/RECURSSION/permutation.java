package RECURSSION;

public class permutation {
    static String swap(String str,int i,int j){
        char[]ch=str.toCharArray();
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        return String.valueOf(ch);
    }
    static void permute(String str,int m,int n){
        if(m==n){
            System.out.println(str);
            return;
        }
        else{
            for(int i=n;i<=m;i++){
                str=swap(str, i, n);
                permute(str, m, n+1);
                str=swap(str, i, n);
            }
        }
    }
    public static void main(String[] args) {
        String str="Abc";
        permute(str,str.length()-1,0);
    }
}
