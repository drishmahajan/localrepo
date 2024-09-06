package PATTERN;

public class Inv_mir__hlw_right {
    public static void main(String[] args) {
       
        int row=5;
        for(int i=row;i>=1;i--){
            for(int j=row-i;j>=1;j--){
                System.out.print(" ");
                }
            for(int k=1;k<=i;k++){
                if(i==1||i==5||k==1||k==i){

                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
