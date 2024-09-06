package PATTERN;

public class Hlw_diamond {
    public static void main(String[] args) {
     for (int index = 1; index <= 10; index++) {
        System.out.print(" *");
    }
    System.out.println();

int rows = 4; 

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows+1; j++) {
                System.out.print(" *");
            }
            for (int k = 1; k <= (2 * i ); k++) {
                System.out.print("  ");
            }
            for (int j = i; j < rows+1; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int i = rows ; i >= 1; i--) {
            for (int j = rows+1; j > i; j--) {
                System.out.print(" *");
            }
            for (int k = 1; k <= (2 * i ); k++) {
                System.out.print("  ");
            }
            for (int j = rows+1; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int index = 1; index < 10; index++) {
            System.out.print(" *");
         }
}}
