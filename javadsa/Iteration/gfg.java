public class gfg {
    public static void main(String[] args) {
        String str="abbba";
        int n=str.length();
        String s="";
        for(int i = n - 1; i >= 0; i--){
               s+=str.charAt(i);
           }
           if(s==str){
               System.out.println(true); 
           }
           else{
            System.out.println(true);}
    }
}
