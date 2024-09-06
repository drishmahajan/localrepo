package RECURSSION;

//import java.util.ArrayList;

public class raylist {
    static void str(String s,String result){
        if(s.length()==0){
            System.out.print(result+",");
            return;
        }
        str(s.substring(1), result);
        str(s.substring(1), result+s.charAt(0));
        
    }
    // static ArrayList<String> str(String s){
    //     if(s.length()==0){

    //         ArrayList<String> list=new ArrayList<>();
    //         list.add("");
    //         return list;
    //     }
    //     char chat=s.charAt(0);
    //     String result=s.substring(1);
    //     ArrayList<String> rs=new ArrayList<>();
    //     ArrayList<String> lit=str(result);
    //     for(String i:lit){
    //         rs.add(i);
    //         rs.add(chat+i);
    //     }
    //     return rs;
        

    // }
    public static void main(String[] args) {
        // ArrayList<Integer> list=new ArrayList<>();
        // for(int i=1;i<=10;i++){
        //     list.add(i);
        // }
        // System.out.println(list);
        // list.remove(4);
        // System.out.println(list);
        // list.get(5);
        // System.out.println(list.get(2));
        String s="AbC";
        // ArrayList<String> list=new ArrayList<>(2*(s.length()));
        str(s,"");   
     }
}
