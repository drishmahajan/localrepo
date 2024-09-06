package RECURSSION;

public class table1 {
    static String helper(int num,int val){
        if(val==0){
            return "";
        }
        String sm=helper(num, val-1);
        String exp=num+"*"+val+"="+(num*val);
        String holo=sm+exp+"\n";
        return holo;
    }
    static String table2(int num){
        return helper(num,10);
    }
    public static void main(String[] args) {
       String r= table2(5);
       System.out.println(r);
    }
}
