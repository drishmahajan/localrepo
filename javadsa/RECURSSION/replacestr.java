package RECURSSION;

public class replacestr {
    
    static String search(String str,char srch,String replace){
        if(str.length()==0){
            return "";
        }
        String smallout=search(str.substring(1), srch, replace);
        if(str.charAt(0)==srch){
            return replace+smallout;
        }
        else{
            return str.charAt(0)+smallout;
        }
        
    }
    public static void main(String[] args) {
        System.out.println(search("AMAN", 'N', "ll"));
    }
}
