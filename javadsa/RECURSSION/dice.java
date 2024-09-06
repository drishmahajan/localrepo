package RECURSSION;

//import java.util.ArrayList;

public class dice {
    public static int maxcut(int start,int end,String result){

        
       // ArrayList<String>list=new ArrayList<>();
        if(start==end){
           // ArrayList<String>lit=maxcut(start, end, result);
                //list.add(result);
                System.out.print(result+"");
                return 1;
            //return list;
        }
        if(start>end){
            //return list;
            return 0;
        }
        // for (int index = 1; index <=6; index++) {
        //     list.addAll(maxcut(start + index, end, result + index));
        // }
        // return list;
            int count=0;
        count=count+maxcut(start+1, end,result+1);
        count=count+maxcut(start+2, end,result+2);
        count=count+maxcut(start+3, end,result+3);
        count=count+maxcut(start+4, end,result+4);
        count=count+maxcut(start+5, end,result+5);
        count=count+maxcut(start+6, end,result+6);
        return count;
    }
    public static void main(String[] args) {
       // ArrayList<String>wow=maxcut(0,3,"");
        System.out.println(maxcut(0, 3, ""));
        //System.out.println("count:"+wow.size());
    }
}
