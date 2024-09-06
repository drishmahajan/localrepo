package PATTERN;

public class Hlw_mir_right {
    public static void main(String[] args) {
       
        int row=5;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
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
