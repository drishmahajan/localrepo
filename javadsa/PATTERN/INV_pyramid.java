package PATTERN;

public class INV_pyramid {
    public static void main(String[] args) {
       
        int row=5;
        for(int i=1;i<=row;i++){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=row-i+1;j++){
                System.out.print(" *");
                }
            System.out.println();
        }
}}
