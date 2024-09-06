package RECURSSION;
public class StringReplaceRecursive {
    static String replacive(String str,String search,String replace){
        int a=str.indexOf(search);
        if(a==-1){
            return str;
        }
        String before=str.substring(0, a);
        String after=str.substring(a+search.length());
        return before+replace+replacive(after,search,replace);
    }
   public static void main(String[] args) {
    String str="hi harry hi ken";
    System.out.println(replacive(str,"hi","hello"));
   }
    }
