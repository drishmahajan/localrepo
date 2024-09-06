package PATTERN;

public class Hlw_Inv_rightriangle {
    public static void main(String[] args) {
        
        int row=5;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i+1;j++){
                if(i==1||i==5||j==1||j==row-i+1){

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
