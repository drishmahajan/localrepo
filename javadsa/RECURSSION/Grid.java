package RECURSSION;

public class Grid {
    static void way(String str,int row,int col,int gridrow,int gridcol){
        if(row==gridrow&&col==gridcol){
            System.out.println(str);
            return ;
        }
        //String[]path=new String[gridrow+gridcol];
        if(row<gridrow){
            way(str+"H", row+1, col, gridrow, gridcol);
            
        }
        if(col<gridcol){
            way(str+"V", row, col+1, gridrow, gridcol);
        }

        
        
    }
    public static void main(String[] args) {
        int grdr=2;
        int grdc=2;
        String str="";
        way(str,0,0,grdr,grdc);
        System.out.println(str);
    }
}
